package com.mycompany.borrarlinke_arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Borrarlinke_arraylist {

    public static void main(String[] args) {
              
        List <Persona> listaArray =new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Fabian",58));
        listaArray.add(new Persona(2, "Mario",62));
        listaArray.add(new Persona(3, "Gabriel",48));
        listaArray.add(new Persona(4, "Jose",32));
        
        LinkedList<Persona> listaLinked =new LinkedList<Persona>();
        listaLinked.add(new Persona (1,"Fabian",58));
        listaLinked.add(new Persona (2,"Mario",62));
        listaLinked.add(new Persona (3,"Gabriel",48));
        listaLinked.add(new Persona (4,"Jose",32));
        
        //metodo remove en ArrayList se la posicion exacta y lo elimino
        listaArray.remove(0);
        //Remove en LinkedList pongo el nombre y recorro la lista 
        String nombreBorrar = "Fabian";
        for (Persona persona2 :listaLinked) {
               if (persona2.getNombre().equals(nombreBorrar)){
                    listaLinked.remove(persona2);
                        break; //corto que deje recorrer
            }
        }
        // verifico por pantalla
        System.out.println("----------------Luego de Eliminar");
        System.out.println("----------------ARRAYLIST");
            for (Persona persona:listaArray) {
        System.out.println("prueba  " + persona.getNombre());
            }
            
        System.out.println("----------------LINKEDLIST");
            for (Persona persona: listaLinked) {
                System.out.println("prueba  " + persona.getNombre());
            }    
        // Tamaño de la lista listarray
        System.out.println("---------------Que tamaño tiene la lista -----");
        System.out.println("ArrayList: "  +  listaArray.size());
        // metodo LinkedList
        System.out.println("LinkedList  "+ listaLinked.size());
            
        // obtener primer objeto solo LinkedList
        System.out.println("-----  Primer y Ultimo OBJETO (solo Linked");
        System.out.println("Primero de LinkedList "+ listaLinked.getFirst()
        .toString());
        System.out.println("Ultimo de LinkeList " + listaLinked.getLast()
        .toString());
        //borrar toda la lista
        System.out.println("----- Borrando la lista------");
        //borrar con Array con la funcion clear
        listaArray.clear();
        //borrar con linked con la funcion clear
        listaLinked.clear();
        //comprobar si esta vacia 
        System.out.println("----------Esta vacia alguna lista?");
        // pregunto por array con la funcion is empty
        System.out.println("ArrayList: " + listaArray.isEmpty());
        // pregunto por Linked List con funcion is empty
        System.out.println("LinkedList:  " + listaLinked.isEmpty());
    }
}
