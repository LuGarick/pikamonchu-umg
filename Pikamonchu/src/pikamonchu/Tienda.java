/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pikamonchu;
import java.util.ArrayList;


/**
 *
 * @author selvi
 */
public class Tienda {
    private String nombreTienda;
    private String ubicacion;
    private ArrayList<Consumible> consumibles;
    private ArrayList<Pokemon> pokemones;
   
    public Tienda(String nombreTienda, String ubicacion){
        this.nombreTienda = nombreTienda;
        this.ubicacion = ubicacion;
        this.consumibles = new ArrayList<>();
        this.pokemones = new ArrayList<>();
     }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Consumible> getConsumibles() {
        return consumibles;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setConsumibles(ArrayList<Consumible> consumibles) {
        this.consumibles = consumibles;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
   
    
    
    public void agregarConsumiblesTienda(Consumible co){
        if(consumibles.size() < 10){
            boolean existe = false;
            for(int i = 0; i <consumibles.size();i++){
                if(co.getNombreConsumible().equals(consumibles.get(i).getNombreConsumible())){
                    int c = co.getCantidad()+consumibles.get(i).getCantidad();
                    consumibles.get(i).setCantidad(c);
                    existe = true;
                    break;
                };
            }
            if(!existe){
                consumibles.add(co);
                System.out.println("se agrego el consumible: "+co.getNombreConsumible()+" de tipo: "+co.getTipoConsumible());
            }
        }else{
            System.out.println("no hay espacio para agregar mas consumibles");
        }
    }
    public void mostrarConsumiblesTienda(){
        System.out.println("Consumibles en venta: ");
        for(int i = 0; i< consumibles.size(); i++){
            if(consumibles.size() > 0){
                System.out.println("posicion :"+i+consumibles.get(i).getCantidad()+" Nombre: "+consumibles.get(i).getNombreConsumible()+" Tipo: "+consumibles.get(i).getTipoConsumible()+" precio: "+consumibles.get(i).getValor());
            }
        }
    }
    
    public void agregarPokemonTienda(Pokemon po){
        
    }
    
}
