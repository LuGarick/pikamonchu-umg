/*{
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pikamonchu;

/**
 *
 * @author selvi
 */
public class Persona {
    protected String nombre;
    protected String genero;
    protected String nacionalidad;
    protected int edad;
    protected double altura;
    
    
    public Persona(String nombre,String genero,String nacionalidad, int edad, double altura){
        this.nombre=nombre;
        this.genero=genero;
        this.nacionalidad=nacionalidad;
        this.edad = edad;
        this.altura = altura;
    }
    
    public Persona(){    
    }
    
    public String getNombre(){
        return nombre;
    }
     
    public String getGenero(){
        return genero;
    }
     
    public String getNacionalidad(){
        return nacionalidad;
    }
     
    public int getEdad(){
        return edad;
    }
     
    public double getAltura(){
        return altura;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        
    public void setGenero(String genero){
        this.genero = genero;
    }
        
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
        
    public void setEdad(int edad){
        this.edad = edad;
    }
        
    public void setAltura(double altura){
        this.altura = altura;
    }
    
}
