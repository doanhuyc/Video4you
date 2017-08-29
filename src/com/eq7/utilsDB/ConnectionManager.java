package com.eq7.utilsDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionManager {
    /**
     * Log4j
     */
	 private Connection connection;

	
    public ConnectionManager() {
		// TODO Auto-generated constructor stub
	}


	/**
     * Get Connection
     * 
     * @return Connection object
     */
	
    public  Connection getConnection() {
        // Initializing Configuration object
        Configuration conf = new Configuration();
        try {

            Class.forName(conf.getDbDriver()).newInstance();
            this.connection = DriverManager.getConnection(conf.getDbUrl() + conf.getDbName(), conf.getDbUserName(), conf.getDbPassWord());
            // logger.info("Connected to the database");
        } catch (SQLException sqlex) {
        	System.out.println("SQL Exeption: " + sqlex);
            return null;
        } catch (ClassNotFoundException ex) {
        	System.out.println("ClassNotFoundException");
            return null;
        } catch (InstantiationException e) {
        	System.out.println("InstantiationException: " + e);
            return null;
        } catch (IllegalAccessException e) {
        	System.out.println("IllegalAccessException: " + e);
            return null;
        }
        return connection;
    }

    /**
     * get data from db
     * @param sql query SELECT
     * @return ResultSet
     */
    public ResultSet executeQuery(String sql) {
       ResultSet rs = null;
       try {

          Statement sm = this.connection.createStatement();
          rs = sm.executeQuery(sql);
       } catch (SQLException ex) {
          System.out.println(ex.getMessage());
       }
       return rs;
    }
    
    /**
     * Insert,delete, update database
     * @param sql query UPDATE, INSERT, DELETE
     * @return num row Insert,delete, update , else -1 : Fail
     * @exception SQLException
     */
    public int executeUpdate(String sql) {
       int num = -1;
       try {
          Statement sm = this.connection.createStatement();
          num = sm.executeUpdate(sql);
       } catch (SQLException ex) {
         System.out.println(ex.getMessage());
       }
       return num;
    }
   
	/**
     * Clean result set
     * 
     * @param ResultSet rs
     * @return void
     */
    public  void Close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            	System.out.println("SQL Exeption: Clean ResultSet fail: " + e);
            }
        }
    }
      

    /**
     * Clean Connection
     * 
     * @param Connection con
     * @return void
     */
    public  void Close() {
        if (connection != null) {
            try {
            	this.connection.close();
            } catch (SQLException e) {
            	System.out.println("SQL Exeption: Clean Connection fail: " + e);
            }
        }
    }

}
