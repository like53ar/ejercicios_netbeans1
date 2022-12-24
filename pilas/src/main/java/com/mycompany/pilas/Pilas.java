package com.mycompany.pilas;

import java.util.Stack;

/**
 *
 * @author Fabian
 */
public class Pilas {

    public static void main(String[] args) {
        
    // utilizo el metodo Stack para crear mi pila de objetos, tendra como 
   //  caracterirstica el uso del metodo LIFO (ultimo entrado primero salido)
   
        Stack<Integer> pila= new Stack<Integer>();
        
   // Antes de agregar los datos a la pila de objetos pregunto si esta vacia

        System.out.println("Pila   " + pila);
        System.out.println("Esta vacia ?  " + pila.isEmpty());
   
   
    // como agrego objeto al Stack con las siguientes sentencias
    // .push
    
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
    //como recorro la pila para poder buscar foreach
        
    for( Integer pilita:pila) {
        System.out.println(pilita);
    }  
    
    // como muestro la pila de objeto
    
        System.out.println("Pila   " + pila);
        System.out.println("Pila vacia ?  " + pila.isEmpty());
    
    // eliminar el ultimo registro que entro metodo pop , si 
    // trabajamos con objetos no usamos search 
    
        pila.pop();
        System.out.println(" Esta el 3 ?  "  + pila.search(3));
        
    // para saber cual fue el ultimo elemento agregado metodo peek
    
        System.out.println("Ultimo agregado " + pila.peek());
        
        
    }
}
