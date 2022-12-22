/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejeciciovectores;

import java.util.Scanner;

/**
 * Realizar un programa que permita cargar 15 numeros en un vector.Una vez cargados
 * se necesita que el programa cuente e informe por pantalla cuantas vecesse cargo el 
 * numero 3
 * @author fabian
 */
public class Ejeciciovectores {

    public static void main(String[] args) {
        int vector [] = new int [15];
        
         Scanner teclado = new Scanner(System.in);
         
    //cargar nuestro vector 
         for(int i =0; i<15;i++){
             System.out.println("Ingrese un numero para el vector ");
             vector [i]= teclado.nextInt();
            }
   //recorrer y contar cuanto nuemros tres hay
   int cont =0;
         for(int i =0 ;i<15; i++){
             if(vector [i] == 3) {
                 cont = cont + 1;
             }
         }
        
        System.out.println("La cantidad numero 3 que hay en el vector es : " + cont );
                        
    }
}
