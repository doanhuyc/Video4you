package com.eq7.utilsDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Configuration {
    /**
     * Log4j
     */
    /**
     * name of properties file
     */
    private static final String PROPERTIES_FILE = "resources/config.properties";
    /**
     * database name
     */
    private String dbName;
    /**
     * UserName
     */
    private String dbUserName;
    /**
     * Password
     */
    private String dbPassWord;
    /**
     * Driver
     */
    private String dbDriver;
    /**
     * url
     */
    private String dbUrl;

    /**
     * Constructor
     */
    public Configuration() {
        Config();
    }

    /**
     * @return the user name of database
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /**
     * @return the password of database
     */
    public String getDbPassWord() {
        return dbPassWord;
    }

    /**
     * @return the driver of database
     */
    public String getDbDriver() {
        return dbDriver;
    }

    /**
     * @return the url of database
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     * @return the name of database
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Get parameters from properties file and set to properties
     * 
     * @return void
     */
    private void Config() {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream(PROPERTIES_FILE));
            this.dbName = pro.getProperty("db.name");
            this.dbDriver = pro.getProperty("db.driver");
            this.dbPassWord = pro.getProperty("db.password");
            this.dbUrl = pro.getProperty("db.url");
            this.dbUserName = pro.getProperty("db.username");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException " + e);
        } catch (IOException e) {
        	System.out.println("IOException " + e);
        }

    }
}
