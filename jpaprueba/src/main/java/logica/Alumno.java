/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
// anotattions para mapear los datos con la base de datos

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mapeamos nuestra clase como una entidad
 * @author Fabian
 * Entity para convertir en tabla de la base de datos
 */

@Entity
public class Alumno implements Serializable {
    
// para definir la primary key autogenerandose valores
   
    @Id
//para definir ademas que campo sera clave primaria tabien le definimos estrategia para hacerlo
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
// para definir campos rellenos
    @Basic
    private String nombre;
    private String apellido;
// para trabajar con fechas completas 
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
    
}
