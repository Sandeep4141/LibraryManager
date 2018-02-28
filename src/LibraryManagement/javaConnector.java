/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Albert
 */
public class javaConnector
{
    Connection conn;
    
    
    public static Connection connerDb()
    {
    try{
   // Class.forName("org.sqlite.JDBC");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManager?useSSL=false" ,"root" ,"Albert");
    return conn;
}catch( SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            }
  }
}
