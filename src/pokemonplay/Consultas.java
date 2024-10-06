package pokemonplay;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pokemonplay.Conexion;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultas {
     protected Conexion conn = new Conexion();
     private Statement st;
     private ResultSet rs;
     private String query;
     String resultado="";
     private int contador=0;
     public ArrayList<Pokemon> listaPokemon = new ArrayList<>();
     
     public Consultas(){
         
     }
     
     public void consultaPokemon(String tipo){
        query = "SELECT * FROM pokemon WHERE tipo_pokemon = '" + tipo + "'";
        
        try {
            st = conn.conexion.createStatement();
            rs = st.executeQuery(query);
            
            System.out.println("Id pokemon" + "  v " + " d");
            while (rs.next()) {
                contador=contador + 1;
                
                resultado += contador + " " + rs.getString("nombre_pokemon")
                + " " + rs.getInt("velocidad_pokemon")+ " " + rs.getInt("defensa_pokemon")+ "\n";
            }               
            
            contador++;
            System.out.println(resultado + contador + ". Salir");
            System.out.println("Elije pokemon");
            
            resultado="";
            contador=0;
            
            //conn.conexion.close();
            
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error" + e.getMessage());
        }
          
    }
     
     public void consultaJugador(){
        query = "SELECT * FROM Jugador";
        
        try {
        
             
            st = conn.conexion.createStatement();
            rs = st.executeQuery(query);
            
            System.out.println("Id jugador" + "  nombre ");
            
           
            while (rs.next()) {
                contador=contador + 1;
                
                resultado += rs.getString("id_jugador") + " " + rs.getString("nombre_jugador")+ "\n";
            }               
            
            contador++;
            System.out.println(resultado + contador + " Salir");
            System.out.println("Elije jugador");
           
            //conn.conexion.close();
            
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error" + e.getMessage());
        }
          
    }
    
}
