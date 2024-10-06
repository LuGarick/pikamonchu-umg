
package pokemonplay;

import java.util.Scanner;

public class Principal {
    static Consultas conn = new Consultas();
    static Scanner sc = new Scanner(System.in);
    private static int item=0;
    private static int indice=0;
    static Pokemon jugador1, jugador2;
    
    
    public static void main(String[] args) {
        int jugador = 1;
        
        do {
        System.out.println("seleccion de pokemon de jugador " + jugador);
        System.out.println("1. Tipo Electrico");
        System.out.println("2. Tipo Fuego");
        System.out.println("3. Tipo Tierra");
        System.out.println("4. Tipo Agua");
        System.out.println("5. Tipo Planta");
        System.out.println("Elegir un tipo");
        item =sc.nextInt();
        
        switch (item) {
            case 1 -> {
                conn.consultaPokemon("Electrico");
                indice = sc.nextInt();
                    switch (indice) { // pokemon electrico
                        case 1 -> {
                            Electrico pikachu = new Electrico("pikachu","electrico",55,75,60);
                            pikachu.agregarAtaque("impact trueno", 90, "electrico");
                            pikachu.agregarAtaque("rayo", 75, "electrico");
                            if(jugador==1){
                                jugador1 = pikachu;
                            }else{
                                jugador2 = pikachu;
                            }
                        }
                        case 2 ->{
                            Electrico voltorb = new Electrico("voltorb","electrico",75,56,65);
                            voltorb.agregarAtaque("envestida", 25, "normal");
                            voltorb.agregarAtaque("envestida", 10, "normal");
                            if(jugador==1){
                                jugador1 = voltorb;
                            }else{
                                jugador2 = voltorb;
                            }
                        }
                        case 3 ->{
                            Electrico electabuzz = new Electrico("electabuzz","electrico",45,65,70);
                            electabuzz.agregarAtaque("impact trueno", 90, "electrico");
                            electabuzz.agregarAtaque("tormenta electrica", 90, "electrico");
                            
                            if(jugador==1){
                                jugador1 = electabuzz;
                            }else{
                                jugador2 = electabuzz;
                            }
                        }
                            default -> System.out.println("opcion incorrecta");
                        }
                
                break;
            } // pokemon electrico
            case 2 ->{                         // pokemon fuego
                conn.consultaPokemon("Fuego"); // pokemon fuego
                  indice = sc.nextInt();
                     switch (indice) {
                        case 1 -> {
                         Fuego charmander = new Fuego("charmander","fuego",40,90,55);
                         charmander.agregarAtaque("llamarada", 65, "fuego");
                            if(jugador==1){
                                jugador1 = charmander;
                            }else{
                                jugador2 = charmander;
                            }
                         //charmander.mostrarAtaques();
                        }
                        case 2 -> {
                         Fuego vulpix = new Fuego("vulpix","fuego",60,80,60);
                         vulpix.agregarAtaque("llamarada", 55, "fuego");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = vulpix;
                            }else{
                                jugador2 = vulpix;
                            }
                        }
                        
                         case 3 -> {
                         Fuego Salazzle = new Fuego("Salazzle","fuego",75,60,40);
                         Salazzle.agregarAtaque("puño fuego", 75, "fuego");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Salazzle;
                            }else{
                                jugador2 = Salazzle;
                            }
                        }
                        default -> {
                         System.out.println("Error");
                       }
                     }
                break;
            }  // pokemon fuego
            case 3 ->{
                 conn.consultaPokemon("Tierra");
                  indice = sc.nextInt();
                     switch (indice) {
                        case 1 -> {
                         Tierra Rhydon = new Tierra("Rhydon","tierra",45,62,55);
                         Rhydon.agregarAtaque("terremoto", 65, "tierra");
                            if(jugador==1){
                                jugador1 = Rhydon;
                            }else{
                                jugador2 = Rhydon;
                            }
                         //charmander.mostrarAtaques();
                        }
                        case 2 -> {
                         Tierra Sandshrew = new Tierra("Sandshrew","tierra",60,80,60);
                         Sandshrew.agregarAtaque("Terratemblor", 85, "tierra");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Sandshrew;
                            }else{
                                jugador2 = Sandshrew;
                            }
                        }
                        case 3 -> {
                         Tierra Excadrill = new Tierra("Excadrill","tierra",75,90,60);
                         Excadrill.agregarAtaque("Fuerza Telúrica", 60, "tierra");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Excadrill;
                            }else{
                                jugador2 = Excadrill;
                            }
                        }
                        default -> {
                         System.out.println("Error");
                       }
                     }
                break;
              
            }  // pokemon tierra
            case 4 ->{
                 conn.consultaPokemon("Agua");
                  indice = sc.nextInt();
                     switch (indice) {
                        case 1 -> {
                         Agua Squartle = new Agua("Squartle","agua",40,90,55);
                         Squartle.agregarAtaque("surf", 90, "agua");
                            if(jugador==1){
                                jugador1 = Squartle;
                            }else{
                                jugador2 = Squartle;
                            }
                         //charmander.mostrarAtaques();
                        }
                        case 2 -> {
                         Agua Lapras = new Agua("Lapras","agua",40,55,70);
                         Lapras.agregarAtaque("Rayo burbuja", 55, "agua");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Lapras;
                            }else{
                                jugador2 = Lapras;
                            }
                        }
                        case 3 -> {
                         Agua Swampert = new Agua("Swampert","agua",40,55,70);
                         Swampert.agregarAtaque("Danza de la lluvia", 60, "agua");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Swampert;
                            }else{
                                jugador2 = Swampert;
                            }
                        }
                        default -> {
                         System.out.println("Error");
                       }
                     }
                break;
                
            }  // pokemon agua
            case 5 ->{
                 conn.consultaPokemon("Planta");
                  indice = sc.nextInt();
                     switch (indice) {
                        case 1 -> {
                         Planta Bulbasaur = new Planta("Bulbasaur","planta",40,90,55);
                         Bulbasaur.agregarAtaque("placaje", 40, "planta");
                         Bulbasaur.agregarAtaque("grunido", 5, "normal");
                         Bulbasaur.agregarAtaque("latigo cepa", 45, "planta");
                         
                            if(jugador==1){
                                jugador1 = Bulbasaur;
                            }else{
                                jugador2 = Bulbasaur;
                            }
                         //charmander.mostrarAtaques();
                        }
                        case 2 -> {
                         Planta Venusaur = new Planta("Venusaur","planta",60,80,60);
                         Venusaur.agregarAtaque("Rayo solar", 80, "planta");
                         Venusaur.agregarAtaque("Hoja magica", 60, "planta");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Venusaur;
                            }else{
                                jugador2 = Venusaur;
                            }
                        }
                        
                        case 3 -> {
                         Planta Serperior = new Planta("Serperior","planta",60,80,60);
                         Serperior.agregarAtaque("Sintesis", 75, "planta");
                         Serperior.agregarAtaque("Hoja afilada", 35, "planta");
                         //vulpix.mostrarAtaques();
                           if(jugador==1){
                                jugador1 = Serperior;
                            }else{
                                jugador2 = Serperior;
                            }
                        }
                        default -> {
                         System.out.println("Error");
                       }
                     }
                break;
            
            }  // pokemon planta
            default -> System.out.println("Opcion incorrecta");
    
        }
        
        jugador++;
        
         } while (jugador<3);
        
       //PONER A COMBATIR LOS POKEMON SELECCIONADOS
       Combate combate = new Combate("squartle","agua",10,0,18);
       
        System.out.println(jugador1.getNombre()+ " vrs " + jugador2.getNombre());
       
       combate.iniciarCombate(jugador1,jugador2);
    }
}

