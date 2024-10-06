
package pokemonplay;

import java.util.*;

public class Fuego extends Pokemon{
    
    //ArrayList<Ataque> ataques;

    public Fuego(String nombre, String tipo, int defensa, int velocidad,int fuerza) {
        super(nombre, tipo, defensa, velocidad,fuerza);
        this.ataques = new ArrayList<>();
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
        int danioBase = this.fuerza - oponente.getDefensa();
        double multiplicador = 1.0;

        // Modificar el multiplicador según el tipo del enemigo
        switch (oponente.getTipo()) {
            case "Agua":
                multiplicador = 0.5;  // Fuego es menos efectivo contra Agua
                break;
            case "Tierra":
                multiplicador = 0.5;  // Fuego es menos efectivo contra Tierra
                break;
            case "Eléctrico":
                multiplicador = 1.0;  // Fuego y Eléctrico no tienen ventajas/desventajas mutuas
                break;
            case "Fuego":
                multiplicador = 0.5;  // Fuego es menos efectivo contra Fuego
                break;
            default:
                multiplicador = 1.0;  // Sin efecto especial para otros tipos
                break;
        }
        
        // Calcular daño final
        int danioFinal = (int)(danioBase * multiplicador);

        if (danioFinal > 0) {
            oponente.recibirdanio(danioFinal);
            System.out.println(this.nombre + " ha atacado a " + oponente.getNombre() + " causando " + danioFinal + " puntos de daño.");
        } else {
            System.out.println(this.nombre + " ha atacado a " + oponente.getNombre() + " pero no ha causado daño.");
        }
    }

    @Override
    public String toString() {
        return "Fuego{" + "ataques=" + ataques + '}';
    }

    
   
  
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


  
   
}
