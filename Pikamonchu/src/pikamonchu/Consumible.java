/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pikamonchu;

/**
 *
 * @author selvi
 */
public class Consumible {
    private String nombreC;
    private String tipoC;
    private int valor;
    private int cantidad;
    
    public Consumible(String nombreC, String tipoC, int valor, int cantidad){
        this.nombreC = nombreC;
        this.tipoC = tipoC;
        this.valor = valor;
        this.cantidad = cantidad;
    }
    
    public String getNombreConsumible(){
        return nombreC;
    }
    public String getTipoConsumible(){
        return tipoC;
    }
    public int getValor(){
        return valor;
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    
    
    
}
