package com.mycompany.colecciones;
//
 public class persona {
    // definicion de variables de personas
    private int num;
    private String nombre;
    private int edad;

    public persona() { // constructor vacio
    }
    
    public persona(int num, String nombre, int edad) { //coonstructor lleno
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getNum() {   // creacion de getter and setter
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
