/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colecciones_array;

import java.util.ArrayList;
import java.util.List;

/**
 * colecciones dinamicas array lists
 -* @author fabia
 */
public class Colecciones_array {

    public static void main(String[] args) {
       // llamamos al procedimiento list para el array
       
       List <Persona> lista = new ArrayList <Persona>();
       lista.add(new Persona (1,"Fabian",58 ));
       lista.add(new Persona (2,"Fabio",48 ));
       lista.add(new Persona (1,"Carla",47 )); 
       lista.add(new Persona (1,"Carlos",37 )); 
       
       //recorrer por indice  suma 1 a i cada vez que pasa
        System.out.println("----------------FOR------------");
            for (int i=0; i < lista.size();i++) {
                System.out.println(" prueba " +  lista.get(i).getNombre());
            }
       // recorrer por for each
       
        System.out.println("------------FOREACH------");
        for (Persona perso:lista) {
            System.out.println("prueba;   " + perso.getNombre());
        }
        
       }
              
       
    
       
        
        
        
    }

