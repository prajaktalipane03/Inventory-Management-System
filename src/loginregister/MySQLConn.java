/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
//This class contain database connection 
public class MySQLConn {
    Connection conn;
    public Connection getConn(){
    
     try{
        // Class.forName("com.mysql.jdbc.Driver");
         Class.forName("com.mysql.jdbc.Driver");  
         JOptionPane.showMessageDialog(null, "Driver Load");
      //  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306:csmssteacherinfo","root","root");
      conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prajakta","root","@PrajaktaMysql3"); 
	JOptionPane.showMessageDialog(null, "Databse Connection SuccessFul MySQLConnect getconn method ");
        //;Class.forName("com.mysql.jdbc.Driver");  
  
        return conn;             
          }
        catch(Exception se)
        {
	JOptionPane.showMessageDialog(null, "Error in MySQLConnect getconn method "+se);
        }
     return conn;
    }
    
    
}
