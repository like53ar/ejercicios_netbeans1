/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claabstracta;

/**
 *
 * @author Fabian
 * Circulo es tambien hija de la clase abstracta figura y pone override
 */
public class  Circulo  extends figura {
    // declaro variable para calcular 
    private double radio;
    
    //constructor vacio

    public Circulo() {
    }
    
    // constructor lleno 

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    
    

    @Override
    public double calcularArea() {
       double pi = 3.14 ;
       double resultado = pi * radio * radio ;
        return resultado;
    }
    
}
