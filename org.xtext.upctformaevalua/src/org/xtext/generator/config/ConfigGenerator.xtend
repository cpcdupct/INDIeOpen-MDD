package org.xtext.generator.config

import java.util.Properties

class ConfigGenerator {

    val VERSION = "4.1.0";
    public static val ConfigGenerator INSTANCE = new ConfigGenerator();

    // Set production as the default mode to avoid breaking changes
    boolean production;
    Properties properties;

    new() {
        production = System.getenv("PRODUCTION") === null || System.getenv("PRODUCTION") != "false";
        properties = new Properties();
        properties.load(
            getClass().getResourceAsStream(
                if(production) "/config.properties" else "/config_dev.properties"));
    }

    def getCDNUrl() {
        return properties.getProperty("CDN_URL");
    }

    def getVersion() { VERSION }

    def getURLVersion() { "v" + VERSION.replace('.', '-') }
}
