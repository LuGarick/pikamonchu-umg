/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pikamonchu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author selvi
 */
public class Pokemon {
    //ejemplo de atributos para inventario y jugador
    protected String nombre;
    protected int vida;
    protected ArrayList<Ataque> ataques;
    protected int defensa;
    protected int maxV;
    protected double altura;
    
    
    public Pokemon(String nombre, int vida, int defensa, double altura){
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.altura=altura;
        this.maxV = vida;
        this.ataques = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public int getDefensa() {
        return defensa;
    }
    public int getMaxVida(){
        return maxV;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setMaxV(int maxV){
        this.maxV=maxV;
    }
    
    
    public void agregarA(Ataque ataque){
        if(ataques.size() < 7){
            ataques.add(ataque);
            System.out.println("se agrego el ataque "+ataque.getNombreA()+" con daño de "+ataque.getDaño());
        }else{
            System.out.println("los espacios de los ataques estan llenos");
        }
    }
    
    public void curar(Pokemon pokemon, Consumible con){
        if(pokemon.vida > 0){
            pokemon.vida += con.getValor();
            if(pokemon.vida > pokemon.maxV){
                int dif = pokemon.vida - pokemon.maxV;
                pokemon.vida -= dif;
            }
        }else{
            System.out.println("su pokemon ya a sido derrotado");
        }
        
    }
    
    
    
    
    
}
