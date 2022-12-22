/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciointegrado1;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Ejerciciointegrado1 {

    public static void main(String[] args) {
        
       double sueldo;
        sueldo = 0;
       int categoria;
       
       /**
        * creame una variable tipo scanner que me permita cargar 
        * variables al sistema
        */
        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        Scanner teclado= new Scanner (System.in);
        categoria =teclado.nextInt();
        
        if (categoria == 1 )
        {
            sueldo = 15890.00; 
        }
        
        else{
            if(categoria == 2){
                sueldo = 25630.89;
            }
            else{
                if (categoria == 3){
                    sueldo = 35560.89/1.10;
                }
                else {
                    System.out.println("Debe ingresar una categoria valida");
                }
            }
        }
        if (categoria == 1 || categoria == 2 ||categoria == 3  ){
        System.out.println("El total del sueldo para la categoria seleccionada " + categoria  +  " es igual a " + sueldo  );
        }
    }
}
