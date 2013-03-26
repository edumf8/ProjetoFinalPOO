/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author c31433
 */
public class ConnectionFactory {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://db4free.net:3306/poodb", "userpoo", "12345678");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

