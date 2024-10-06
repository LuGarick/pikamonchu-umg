package pokemonplay;

import java.util.ArrayList;

public abstract class Pokemon {
    
    protected  String nombre;
    protected String tipo;
    protected int defensa;
    protected int velocidad;
    protected int fuerza;
    protected int vida;
    protected ArrayList<Ataque> ataques = new ArrayList<>();

    
    public Pokemon(String nombre,String tipo, int defensa, int velocidad, int fuerza) {
        this.nombre = nombre;
        this.tipo= tipo;
        this.defensa=defensa;
        this.velocidad=velocidad;
        this.vida=100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }
 
   
    public abstract  void atacar(Pokemon oponente);
    public  boolean estavivo(){
        return vida > 0;
    }
    
    public void recibirdanio(int danio){
        int danioRecibido = danio - this.defensa;
        if (danioRecibido > 0) {
            this.vida -= danioRecibido;
        }
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nombre + " recibió " + danioRecibido + " de daño. Vida restante: " + this.vida);
    }
    

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", tipo=" + tipo + ", defensa=" + defensa + ", velocidad=" + velocidad + ", vida=" + vida + '}';
    }

      
}
