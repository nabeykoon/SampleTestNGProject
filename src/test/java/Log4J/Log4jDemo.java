package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

    private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
    public static void main(String[] args){

        log.debug("I am debugging");
        log.error("Error message");
        log.info("Information message");
        log.fatal("Fatal message");

    }
}
