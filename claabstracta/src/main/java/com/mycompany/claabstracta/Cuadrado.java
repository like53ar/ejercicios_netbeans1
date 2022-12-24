/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claabstracta;

/**
 *
 * @author Fabian
 */
public class Cuadrado extends figura { // con la palabra extends relacionamo al padre e implementamo los metods abstractos
      
    
    // declaro variable de lado
    private double lado;

    
    // constructor vacio
    public Cuadrado() {
    }

    // constructor lleno
    public Cuadrado(double x, double y) {
        super(x, y);
    }
    
    
    
    
    @Override // sobreescritura de metodo
    public double calcularArea() {
        double resultado = lado * lado ;
        return resultado;       
    
    }
    
    
}
