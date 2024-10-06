
package pokemonplay;

import java.util.ArrayList;

public class Electrico extends Pokemon{
    
     private ArrayList<Ataque> ataques;

    public Electrico(String nombre, String tipo, int defensa, int velocidad, int fuerza) {
        super(nombre, tipo, defensa, velocidad, fuerza);
        this.ataques= new ArrayList<>();
    }
    
     // Método para agregar ataques
    public void agregarAtaque(String nombreAtaque, int poder, String tipo) {
        Ataque ataque = new Ataque(nombreAtaque, poder,tipo);
        this.ataques.add(ataque);
       
    }

    // Método para mostrar los ataques del Pokémon
    public void mostrarAtaques() {
        System.out.println("Ataques de " + nombre + ":");
        for (Ataque elemento : ataques) {
            System.out.println(elemento);
        }
    }

    @Override
    public void atacar(Pokemon oponente) {
        System.out.println(oponente.getNombre());
    }
    
    
}
