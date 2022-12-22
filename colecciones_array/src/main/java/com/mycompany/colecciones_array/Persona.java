/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones_array;

/**
 *definicion de la clase persona
 * @author fabia
 */
public class Persona {
    
    private int num;
    private String nombre;
    private int edad;

    // constructor vacio
    
    public Persona() {
    }
    
    // constructor lleno

    public Persona(int num, String nombre, int edad) {
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getter and Setter

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
