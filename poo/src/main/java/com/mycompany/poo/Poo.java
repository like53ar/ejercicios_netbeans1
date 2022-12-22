/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo;

/**
 *
 * @author fabia
 */
public class Poo {

    public static void main(String[] args) {
        
        
        
        
        // aplicamos el constructor vacio y el lleno para crear objetos
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"Fabian","Correa");
        
        
        //mostrar datos por pantalla tomando datos del getter
        
        System.out.println("La id del alumno 2 es " + alu2.getId());
        System.out.println("El nombre del alumno 2 es " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es " + alu2.getApellido());
        
        // seteo del alumno vacio
        
        alu1.setId(8);
        alu1.setNombre("Paloma");
        alu1.setApellido("Gonzalex");
        System.out.println("--------------------------");
        System.out.println("La id del alumno 1 es "+ alu1.getId());
        System.out.println("El nombre del alumno 1 es" + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es " + alu1.getApellido());
        
        
        //modificar el alumno 2 que ya trae los datos del getter, con el set
        
        System.out.println("--------------------------");
        alu2.setId(25);
        
        System.out.println("La id del alumno 2 es " + alu2.getId());
        System.out.println("El nombre del alumno 2 es " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es " + alu2.getApellido());
        
        
        
    }
}
