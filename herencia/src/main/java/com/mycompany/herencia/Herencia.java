/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia;

/**
 *
 * @author fabia
 */
public class Herencia {

    public static void main(String[] args) {
        
     /**   empleado emple= new empleado();
        
        emple.getNum_legajo();
        emple.getNombre();
        
        consultor consu= new consultor();
        consu.getNombre_consultora();
    */    
    // polimorfismo en un vector de la clase padre puedo guardar cualquier componente que pertenezca a la clase hija
    
    
    
    persona vector[] = new persona [5];
    vector[0]=new persona ();
    vector[1]= new empleado();
    vector[2]= new consultor();
    vector[3]= new jefe();
    
    // polimorfismo permite que hacer asignaciones de hija a padre , no de su papa a su hijo
    
    persona perso=new persona ();
    consultor consul =new consultor();
    
    perso = consul;
    
            
    
    
    
    }
}
