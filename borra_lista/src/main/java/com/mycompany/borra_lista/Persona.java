/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borra_lista;

/**
 *
 * @author fabia
 */
public class Persona {
private int num;
private String nombre;
private int edad;

//Constructor vacio

    public Persona() {
    }


// constructor lleno

    public Persona(int num, String nombre, int edad) {
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }

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
    
  // convertir en string con el modo constructor to String
  // pasa un objeto a modo string

    @Override
    public String toString() {
        return "Persona{" + "num=" + num + ", nombre=" 
                + nombre + ", edad=" + edad + '}';
    }
    
    



}
