

package com.mycompany.borra_lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class Borra_lista {

    public static void main(String[] args) {
    
    List<Persona> listaArray = new ArrayList <Persona>();
    listaArray.add( new Persona (1,"Fabian",59));
    listaArray.add( new Persona (2,"Fabio",50));
    listaArray.add( new Persona (3,"Carlos",39));
    listaArray.add( new Persona (4,"Julio",19));
    
    LinkedList<Persona> listaLinked = new LinkedList <Persona>();
    listaLinked.add( new Persona (1,"Fabian",59));
    listaLinked.add(new Persona (2,"Fabio",50));
    listaLinked.add(new Persona (3,"Carlos",39));
    listaLinked.add(new Persona (4,"Julio",19));
    
    // metodo remove en Arraylista es desde la posicion exacta y lo elimino
    
   listaArray.remove(0);
   
   // metodo remove en LinkedList pongo el nombre y recorro la lista hasta
   //encontrar el nombre exacto
    
   String nombreBorrar = "Fabian";
   for (Persona persona2:listaLinked){
       if (persona2.getNombre().equals(nombreBorrar)){
           listaLinked.remove(persona2);
            break; // corto y que deje correr 
            }
          
       }
   // verifico por pantalla 
        System.out.println("-----------Luego de Eliminar");
        System.out.println("-----------ARRALIST");
            for (Persona persona:listaArray){
                System.out.println("prueba :  "+ persona.getNum()+"---"
                        + persona.getNombre());
            }
        System.out.println("-----------Luego de Eliminar");
        System.out.println("-----------LINKEDLIST");
            for (Persona persona: listaLinked) {
                System.out.println("prueba  : "  + persona.getNum() +"--"
                        + persona.getNombre());
            }
    // Tamaño de la lista por metodo 
    
        System.out.println("Que tamano tiene la lista -----------");
        System.out.println("Arraylist   :"  + listaArray.size());
        
    // metodo LinkedList         
        System.out.println("LinkedList   " + listaLinked.size());
    
    // obtener primer objeto solo LinkedList
    
        System.out.println("------- Primer y Ultimo Objeto  LinkedList");
    // String completo de largo sino se usa el get fisrt del string
            System.out.println(" Primer Objeto-----------" 
                    +  listaLinked.getFirst().toString()); 
            System.out.println(" Ultimo Objeto ------------"  
                    +   listaLinked.getLast().toString());
            
    // Borrar toda la lista
            System.out.println("Borrando la lista ------------");
            
    // Borrar con Array con la funcion clear       
        listaArray.clear();
    // Borrar con ListArray con la funcion clear
        listaLinked.clear();
    // comprobar si esta vacia
        System.out.println("---------------Estaba Vacia ---------");
    // pregunto por array si vacia con la funcion empty
        System.out.println("ArrayList :  " + listaArray.isEmpty());
    // pregunto por Linked list con funcion is empty
        System.out.println("LinkedList:   " + listaLinked.isEmpty());
    
    
    
   }
        
        
        
        
    }

