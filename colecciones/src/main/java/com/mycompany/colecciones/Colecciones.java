
package com.mycompany.colecciones;

import java.util.LinkedList;
import java.util.List;

/**
 *colecciones dinamicas arraylists
 * @author Fabian
 */
public class Colecciones {

    public static void main(String[] args) {
       //llamamos al procedimiento list entre < >
        
       List <persona> lista  = new LinkedList <persona>(); 
         
       // agregamos personas al final de la lista o al principio
              
       lista.add(new persona (1,"Fabian",59 ));
       lista.add(new persona (2,"Juan",58 ));
       lista.add(new persona (3,"Nestro",60 )); 
       lista.add(new persona (4,"Osvaldo",65 ));
       lista.add(new persona (5,"Sofia ",90 ));
       
       // Agrego al principio
       lista.add(0,new persona (6, "Probando",98));
              
       // recorrer por indice
        System.out.println("----- FOR-------------------");
       for (int i=0; i<lista.size(); i++){
           System.out.println ("prueba: " + lista.get(i).getNombre());
       }
       
        System.out.println("---------FOREACH-------------");
       // recorrer elemento por elemento con foreach
        for (persona perso:lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
        
    }
}
