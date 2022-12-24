
package com.mycompany.interfaz;

/**
 *
 * @author Fabian
 * para usar a interface se utiiza la palabra implements, con coma separamos
 * dos interface
 */
public class Cuadrado implements Figura,Dibujable {
private double lado; // declaro el lado como variable con decimal

//constructor vacio

    public Cuadrado() {
    }

//constructor lleno 

    public Cuadrado(double lado) {
        this.lado = lado;
    }
        
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujado un cuadrado");    
    }
       
}
