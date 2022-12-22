
package com.mycompany.linkelist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class Linkelist {

    public static void main(String[] args) {
        
        
        List<Persona> lista =new ArrayList <Persona>();
                
        // Agregar Persona 
        
        lista.add(new Persona(1,"Fabian",30));
        lista.add(new Persona(2,"Marcelo",35));
        lista.add(new Persona(3,"Juan",40));
        lista.add(new Persona(4,"Ernesto",50));
        
        System.out.println("---------FOREACH--------");
        // Recorrido for foreach
            for (Persona persona:lista){ 
                System.out.println("prueba " + persona.getNombre());
            }
    }
}
