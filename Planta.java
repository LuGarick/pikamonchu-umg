
package pokemonplay;

import java.util.ArrayList;

public class Planta extends Pokemon{
    private ArrayList<Ataque> ataques;

    public Planta(String nombre, String tipo, int defensa, int velocidad, int fuerza) {
        super(nombre, tipo, defensa, velocidad, fuerza);
        this.ataques = new ArrayList<>();
    }
    
    // Método para agregar ataques
    public void agregarAtaque(String nombreAtaque, int poder, String tipo) {
        Ataque ataque_tierra = new Ataque(nombreAtaque, poder,tipo);
        this.ataques.add(ataque_tierra);
       
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
