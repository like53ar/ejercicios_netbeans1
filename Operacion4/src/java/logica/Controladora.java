/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 * Controladora de la logica
 * @author fabia
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearPersona(Persona per){
        controlPersis.crearPersona(per);
    }
    
    public void eliminarPersona (int id){
        controlPersis.eliminarPersona(id);
    }
    
    
    public void eliminarPersona(Persona per){
        controlPersis.eliminarPersona(per);
    }
    
    public List<Persona> traerPersonas(){
        return controlPersis.traerPersonas();
    }
}
