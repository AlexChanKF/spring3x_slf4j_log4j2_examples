package com.mkyong.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Spring bean
 */

public class HelloWorld {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        String message = "Spring 3 : Hello ! " + name;
        LOGGER.trace("trace level " + message);
        LOGGER.debug("debug level " + message);
        LOGGER.info("info level " + message);
        LOGGER.warn("warn level " + message);
        LOGGER.error("error level " + message);
        System.out.println("console level" + message);
    }

}