package modelo;
import controlador.clsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class clsUser {
    //Delaración de variables

    private int Id;
    private String Zona;
    private String Nombre;
    private String Telefono;
    private String Contrasena;

    public ResultSet datos;
    clsConexion conexion = new clsConexion();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String zona) {
        Zona = zona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public void login(){
        try {
            conexion.conectar();
            conexion.sql=conexion.con.prepareStatement("SELECT * FROM udemy_delivery.users WHERE zone = ? AND password2 = ? ");
            conexion.sql.setString(1,Zona);
            conexion.sql.setString(2,Contrasena);
            conexion.sql.executeQuery();

            datos = conexion.sql.getResultSet();

            System.out.println(datos);
            System.out.println(datos);
             
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Lo siento, usuario no existe " +  ex);
       }
   }

    
}


