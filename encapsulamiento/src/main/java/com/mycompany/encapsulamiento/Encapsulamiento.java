/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.encapsulamiento;

/**
 *
 * @author fabia
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        Alumno alu1 =new Alumno ();
        Alumno alu2 = new Alumno (15,"Fabian","Correa");
        System.out.println("id; " + alu2.getId());
        System.out.println("nombre "+ alu2.getNombre());
        System.out.println("apellido " + alu2.getApellido());
    }     
}
