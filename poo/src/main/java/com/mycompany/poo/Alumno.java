/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 * clase creada por netbean new class = java class
 *  * @author fabia
 * definicion de una clase
 * 
 */
public class Alumno {
/*todos los atributos de una clase deben ser privados parar evitar
*que cualquier otra clase pueda usar sus atributos.
*/
    private int id;
    private String nombre;
    private String apellido;
    
    
    //constructor vacio 

    public Alumno() {
    }
    
    // constructor lleno .. this identifica variable locales
    
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //getters (traeme- ver el valor) y setter (setear - colocar y establecer un valor)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    //metodos
    public void mostrarNombre() {
        System.out.println("Hola soy un alunmo y se decir mi nombre");
    
    }
    //metodo con implentacion de una variable al verbo
    
    
    public void saberAprobado(double calificacion){
        if(calificacion >= 6) {
            System.out.println("Aprobe la materia " + calificacion );
        }
        else {
            System.out.println("Desaprobe la materia");    
        }
    
    }
}