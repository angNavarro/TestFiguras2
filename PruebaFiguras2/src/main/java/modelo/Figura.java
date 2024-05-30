/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angel
 */

//Este es el primer archivo que debemos crear 
//Creamos la clase abstracta
public abstract class Figura{
    private String color;
    
    public Figura(String color){
        this.color=color;
       }
    
    //Creamos funciones abstractas
    public abstract String getNom();
    public abstract double getPerimetre();
    public abstract double getArea();

    //Creamos el get
    public String getColor() {
        return color;
    }
    
    
    
}
