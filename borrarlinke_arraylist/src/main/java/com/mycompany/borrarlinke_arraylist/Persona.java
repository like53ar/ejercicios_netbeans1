
package com.mycompany.borrarlinke_arraylist;
public class Persona {
    // definicion de variables de personas
    private int num;
    private String nombre;
    private int edad;
    
    //Constructor vacio

    public Persona() {
    }
    
    //Constructor lleno

    public Persona(int num, String nombre, int edad) {
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getter and Setter

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
   
    // convertir con el contructor modo toString  ( pasa un objeto a modo
    // string
    
    @Override
    public String toString() {
        return "Persona{" + "num=" + num + ", nombre=" + nombre 
                + ", edad=" + edad + '}';
    }
    
}
