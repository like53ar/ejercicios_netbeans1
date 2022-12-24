/*
 * 
 */
package com.mycompany.claabstracta;

/**
 *
 * @author Fabian
 */
public abstract class  figura { // agrego la palabra abstract para crear 
    //la clase abstracta
    protected double x; //pos en x solo sus hijas pueden usarlo
    protected double y; // pos en y solo sus hijas pueden usarlo
    
    // contructor vacio que solo sus hijas puedan usarlo

    protected figura() {
    }
    // constructor lleno que solo sus hijas puedan usarlo
    
    protected figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public abstract double calcularArea();
}
