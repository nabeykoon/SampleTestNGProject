package ExcelDataDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven {


    //Identify TestCases column by scanning the entire 1st row
    //Once column is identified then scan entire testCase column to identify purchase test case
    //Read all data related to purchase test case row

    public ArrayList<String> getData(String testcaseName) throws IOException {
        //Array list to store test case data
        ArrayList<String> testData = new ArrayList<String>();

        //FileInputStream Argument
        FileInputStream file = new FileInputStream("C://Users//nabey//OneDrive//Repos//demodata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testData")) {
                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cells = firstRow.cellIterator();
                int column = 0;
                while (cells.hasNext()) {
                    Cell value = cells.next();
                    if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
                        column = value.getColumnIndex();
                    }
                }
                System.out.println(column);

                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
                        Iterator<Cell> cellsPurchase = r.cellIterator();
                        while (cellsPurchase.hasNext()) {
                            Cell c = cellsPurchase.next();
                            //System.out.println(c.getStringCellValue());
                            if (c.getCellType() == CellType.STRING) {
                                testData.add(c.getStringCellValue());
                            } else {
                                testData.add(String.valueOf(c.getNumericCellValue()));
                            }
                        }
                    }
                }

            }

        }
        return testData;
    }
}
