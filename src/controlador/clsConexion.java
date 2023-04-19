/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sena CSET
 */
public class clsConexion {
    
    //Declaracion de variables
  public Connection con;
  public PreparedStatement sql;
  
  public void conectar(){
      String db ="jdbc:mysql://skytech.czgp6nomvwxi.us-east-2.rds.amazonaws.com:3306/udemy_delivery";
      String usuario ="admin";
      String password ="123456xx";
      
      try{
      String controlador= "com.mysql.cj.jdbc.Driver";
      Class.forName(controlador);
      con=DriverManager.getConnection(db, usuario, password);
       //   JOptionPane.showMessageDialog(null, "Conexión exitosa");
      }
      catch(HeadlessException | ClassNotFoundException | SQLException ex){
      JOptionPane.showMessageDialog(null, "Error al conectar"+ ex);}
  }
}
