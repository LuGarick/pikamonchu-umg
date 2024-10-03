/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pikamonchu;

/**
 *
 * @author selvi
 */
public class Ataque {
    private String nombreA;
    private int daño;
    
    
    public Ataque(String nombreA, int daño){
        this.nombreA = nombreA;
        this.daño = daño;
    }

    public String getNombreA() {
        return nombreA;
    }

    public int getDaño() {
        return daño;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    
    
    
}
