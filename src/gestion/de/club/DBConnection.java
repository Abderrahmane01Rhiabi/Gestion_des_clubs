/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.club;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {


    public static Connection connection() {
        try {

    // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:abdou", "system", "2050");
            return conn;
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }

    }
}   
