
package pokemonplay;

public class Combate extends Pokemon{
private int turno=1;    

    public Combate(String nombre, String tipo, int defensa, int velocidad, int fuerza) {
        super(nombre, tipo, defensa, velocidad, fuerza);
    }
    
    
    public void iniciarCombate(Pokemon jugador1, Pokemon jugador2){

      System.out.println("Empieza el combate entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "");

        if(turno==1 && jugador1.getVida()>0){
            System.out.println("turno de ataque para " + jugador1.getNombre());
       
             
            
        }
        
    }

    @Override
    public void atacar(Pokemon oponente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
