/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angel
 */
public class Circulo extends Figura {
    
    //1- Variable de circulo
    private double radio;

    //2- Creamos el constructor
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
//3-Creamos los supermetodos y los compleamos para este objeto. 
    @Override
    public String getNom() {
        return "Circulo";
    }

    @Override
    public double getPerimetre() {
        return 2*Math.PI*radio;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio, 2);
        
    }
    
    //4-Creamos el toString desde generar codigo.
@Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
}
