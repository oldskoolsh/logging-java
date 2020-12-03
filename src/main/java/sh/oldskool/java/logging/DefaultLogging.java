package sh.oldskool.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultLogging {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DefaultLogging.class);
        logger.info("Hi, this is the default logging.");
    }

}
