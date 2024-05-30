/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angel
 */
public class TrianguloEquilatero extends Figura{
    
    //1-Creamos las variables
    private double base;
    private double altura;

    //2- Generamos el constructor con las variables. 
    public TrianguloEquilatero(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    //3-Implementamos las clases abstractas
    @Override
    public String getNom() {
        return "Triangulo Equilatero";
    }

    @Override
    public double getPerimetre() {
        return base*3;
        
    }

    @Override
    public double getArea() {
        return base*altura/2;
        
    }
    
    //4- Implementamos el toString
 @Override
    public String toString() {
        return "TrianguloEquilatero{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    
}
