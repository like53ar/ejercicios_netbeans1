/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversiones_datos;

/**
 *conversiones de tipos de numerico a String
 * 
 * 
 * @author fabia
 */
public class Conversiones_datos {

    public static void main(String[] args) {
        double num =1.67 ;
        
        
  // casting de tipo de datos primitivos
  // casteo a entero
  int numInt = (int) num;
  
  // casteo a long
  
  long numLong = (long) num ;
        System.out.println("double : " + num );
        System.out.println("int :  "  + numInt);
        System.out.println("long:  " + numLong);
        
   // paso de String a numerico
    String cantidad = "15";  // string es metodo no una clase de numero
    String precio ="150.27";
        
    // proceso para cambiar parseo
    
    int cantEntero =Integer.parseInt(cantidad, numInt);
    double precioDouble=Double.parseDouble(precio);
    
    int edad =30;
    double estatura = 1.67;
    
    
    
    }
    
}
