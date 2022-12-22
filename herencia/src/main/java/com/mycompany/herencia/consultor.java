/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author fabia
 */
public class consultor extends persona {

// datos propios de consultora
    
    String nombre_consultora;
    int numero_consultora;
    
// constructor vacio

    public consultor() {
    }

// constructor lleno con la herencia de persona

    public consultor(String nombre_consultora, int numero_consultora, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.numero_consultora = numero_consultora;
    }

// getter y setter de consultora 

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNumero_consultora() {
        return numero_consultora;
    }

    public void setNumero_consultora(int numero_consultora) {
        this.numero_consultora = numero_consultora;
    }

    
           
    
    
    }
    
    
    
    

