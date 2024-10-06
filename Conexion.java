
package pokemonplay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    protected Connection conexion;
     private String bd="juego_pokemon";
     private String url="jdbc:mysql://localhost:3306/";
     private String user="root";
     private String password="Yesica2236";
     private String driver="com.mysql.cj.jdbc.Driver";
    
    Connection conn;
    
    public Conexion(){   
         url="jdbc:mysql://localhost:3306/juego_pokemon";
        user="root";
        password="Yesica2236";
        try{
            conexion=DriverManager.getConnection(url, user,password);
            if(conexion!=null)
                //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
                System.out.println("Conexion exitosa\n");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error. "+e.getMessage());
        }
    }
    
    /*public Connection conectar(){
        try {
            Class.forName(driver);
            System.out.println(url + bd + user + password);
            conn=DriverManager.getConnection(url + bd,user,password);
            System.out.println("CONECTADO A BASE DE DATOS EXITOSO");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a DB");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return conn;
        
    }
    */
    
    public void desconectar(){
         try {
             conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }    
    
    
    
    
      
}
