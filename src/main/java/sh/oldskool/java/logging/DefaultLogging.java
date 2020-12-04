package sh.oldskool.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultLogging {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DefaultLogging.class);
        logger.info("Hi, this is the info logging.");
        logger.debug("Hi, this is the debug logging.");

        Thread.currentThread().setName("123456");

        logger.trace("Hi, this is the trace logging.");
        logger.warn("Hi, this is the warn logging.");
        logger.error("Hi, this is the error logging.");
    }

}
