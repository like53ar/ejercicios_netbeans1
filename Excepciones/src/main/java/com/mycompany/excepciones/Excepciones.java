/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepciones;

/**
 *
 * @author fabia
 */
public class Excepciones {

    public static void main(String[] args) {
      
     // usar try que es intentar hacer la operacion  yvolcame con catch
        
        try {     
        int resultado = 3/0;}
    // sino puede que utilice una Excepcion 
        catch (Exception e){
            System.out.println("No se puede dividir por 0");
        }
    //solucion cuando el vecto sale de posicion 
        try {
        int edades [] = {15,12,23,30};
        System.out.println("La edad de la posicion 4 es :" + edades[4]);}
        catch (Exception e) {
    // se puede no solo imprimir sino generar metodos, operaciones o activar otros procedimiento
            System.out.println("Intentaste acceder a un indice que no existe");
        }
        
    }
}
