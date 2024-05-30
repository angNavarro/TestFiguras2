/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angel
 */
public class Rectangulo extends Figura {
    
    //1-Introducimos las variables
    private double base;
    private double altura;
    
    //2- Generamos el constructor
public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //3-Importamos los metodos abstractos y los personalizamos. 
    @Override
    public String getNom() {
        return "Rectangulo";
        
    }

    @Override
    public double getPerimetre() {
        return 2*base+2*altura;
        
    }

    @Override
    public double getArea() {
        return base*altura;
    }

    //4-Importamos el toString
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
