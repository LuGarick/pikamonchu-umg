package pokemonplay;

public class Ataque {
    
    private String nombre;
    private int poder;
    private String tipo;

    public Ataque(String nombre, int poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return  nombre + " " + poder + " " + tipo;
    }

    
}
