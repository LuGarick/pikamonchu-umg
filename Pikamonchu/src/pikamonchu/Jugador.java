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
 *
 * @author selvi
 */
public class Jugador extends Persona{
    private Inventario inventario;
    private int creditos;
    private int victorias;
    //private Pokedex[] pokedex;

    public Jugador(Inventario inventario, int creditos, int victorias, /*Pokedex[] pokedex,*/ String nombre, String genero, String nacionalidad, int edad, double altura) {
        super(nombre, genero, nacionalidad, edad, altura);
        this.inventario = inventario;
        this.creditos = creditos;
        this.victorias = victorias;
        //this.pokedex = pokedex;
    }
    
    public void mostrarPokemonL(){
        System.out.println("Inventario de "+nombre+" : ");
        inventario.mostrarPokemonP();
        }
    public void añadirPokemon(Pokemon p){
        System.out.println("Se agregara el siguiente pokemon");
        inventario.agregarPokemon(p);
    }
    public void consumibleUsar(Consumible consumible, Pokemon poke){
        System.out.println("Consumible siguiente usado: ");
        inventario.usarConsumible(consumible, poke);
    }
    public void consumiblesMostrar(){
        inventario.mostrarConsumibles();
    }
    public void comprarTienda(Tienda ti){
        
    }
        
    }
       
    
    

