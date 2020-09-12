package org.ea.main;

import org.apache.log4j.*;
import org.ea.appenders.MyAppender;

public class Log4JExample {
    final static Logger logger = Logger.getLogger(Log4JExample.class);
    public static void main(String[] args) {
        final String PATTERN = "%d [%p|%c|%C{1}] %m%n";

        ConsoleAppender console = new ConsoleAppender();
        console.setLayout(new PatternLayout(PATTERN));
        console.setThreshold(Level.INFO);
        console.activateOptions();
        Logger.getRootLogger().addAppender(console);

        Logger.getRootLogger().addAppender(new MyAppender());

        logger.info("Logging things");
    }
}
