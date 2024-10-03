/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pikamonchu;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author selvi
 */
public class Inventario {
    private ArrayList<Pokemon> pokemonesL;
    private ArrayList<Consumible>consumibles;
    
    
    
    public Inventario(){
     this.pokemonesL = new ArrayList<>();
     this.consumibles= new ArrayList<>();
    }

    public ArrayList<Pokemon> getPokemonesL() {
        return pokemonesL;
    }

    public ArrayList<Consumible> getConsumibles() {
        return consumibles;
    }

    public void setPokemonesL(ArrayList<Pokemon> pokemonesL) {
        this.pokemonesL = pokemonesL;
    }

    public void setConsumibles(ArrayList<Consumible> consumibles) {
        this.consumibles = consumibles;
    }
    
    
    public void agregarPokemon(Pokemon pokemon){
        if(pokemonesL.size() < 3){
            pokemonesL.add(pokemon);
            System.out.println(pokemon.getNombre()+ "fue agregado");
        }else{
            System.out.println("no se puede agregar mas pokemones"); 
        }
    }
    public void eliminarPokemon(Pokemon pokemon){
        pokemonesL.remove(pokemon);
    }
    
    public void agregarConsumible(Consumible consumible){
        if(consumibles.size() < 15){
            boolean existe = false;
            for(int i = 0; i <consumibles.size();i++){
                if(consumible.getNombreConsumible().equals(consumibles.get(i).getNombreConsumible())){
                    int c = consumible.getCantidad()+consumibles.get(i).getCantidad();
                    consumibles.get(i).setCantidad(c);
                    existe = true;
                    break;
                };
            }
            if(!existe){
                consumibles.add(consumible);
                System.out.println("se agrego el consumible: "+consumible.getNombreConsumible()+" de tipo: "+consumible.getTipoConsumible());
            }
        }else{
            System.out.println("no hay espacio para agregar mas consumibles");
        }
    }
    
    public void mostrarConsumibles(){
        System.out.println("Consumibles en el inventario: ");
        for(int i = 0; i< consumibles.size(); i++){
            if(consumibles.size() > 0){
                System.out.println("posicion :"+i+consumibles.get(i).getCantidad()+consumibles.get(i).getNombreConsumible()+consumibles.get(i).getTipoConsumible());
            }
        }
    }
    
    public void mostrarPokemonP(){
        System.out.println("Pokemones en el inventario: ");
        for(int i = 0; i< pokemonesL.size(); i++){
            if(pokemonesL.size() > 0){
                System.out.println("posicion: "+i+" Nombre: "+pokemonesL.get(i).getNombre()+" Ataques: "+pokemonesL.get(i).getAtaques()+"vida: "+pokemonesL.get(i).getVida());
            }else{
                System.out.println("posicion: "+i+" : vacio");
            }
        }
    }
    public void usarConsumible(Consumible consumible, Pokemon poke){
        boolean use = false;
        for(int i = 0; i< consumibles.size();i++){
            String tipo = consumible.getTipoConsumible();
            if(tipo == "curacion"){
                String nombre = consumible.getNombreConsumible();
                switch(nombre){
                    case "pocion":
                        poke.curar(poke, consumible);
                        break;
                    case "pastilla":
                        poke.curar(poke, consumible);
                        break;
                    case "fruta":
                        poke.curar(poke, consumible);
                    default:
                        System.out.println("el objeto no existe");
                        break;
                }
            }else if(tipo == "combate"){
                
            }else if(tipo == "evolucion"){
                
            }
        }
    }
    
}
