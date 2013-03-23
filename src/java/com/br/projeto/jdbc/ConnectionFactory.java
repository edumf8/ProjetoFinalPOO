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

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/projeto", "root", "hipodromo");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

