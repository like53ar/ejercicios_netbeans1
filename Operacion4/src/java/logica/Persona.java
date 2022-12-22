/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *mapeo de la clase con la entidad anotaciones
 * @author fabia
 */

@Entity
public class Persona implements Serializable {
    
//creo mapeo        
    @Id
// genera ID en forma automatica generando estrategia 
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    
    
    // constructor vacio 

    public Persona() {
    }
    
    // constructor lleno

    public Persona(int id, String DNI, String nombre, String apellido, String telefono) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
    
    
    
    
}
