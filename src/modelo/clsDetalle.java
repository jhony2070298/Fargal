/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sena CSET
 */
public class clsDetalle {
    //Declaracion de variables
    private String tokenUser;
    public ResultSet datos;
    clsConexion objCon = new clsConexion();
    //Encapsulacion

    public String getTokenUser() {
        return tokenUser;
    }

    public void setTokenUser(String tokenUser) {
        this.tokenUser = tokenUser;
    }
    //Declaración de métodos
    
    public void llenarTablaDetalle(){
         try {
            objCon.conectar();
            objCon.sql=objCon.con.prepareStatement("select * from persona where Docper= ? ");
            objCon.sql.setString(1,tokenUser);
            objCon.sql.executeQuery();
            datos = objCon.sql.getResultSet();
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lo siento, no se encontro el documento" +  ex);
        }
    }
}
