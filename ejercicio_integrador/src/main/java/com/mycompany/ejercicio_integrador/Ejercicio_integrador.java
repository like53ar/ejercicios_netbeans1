

package com.mycompany.ejercicio_integrador;

/**
 *
 * @author Fabian
 * Logica
 */
public class Ejercicio_integrador {

    public static void main(String[] args) {
        
        //creamos los personajes para que puedan interactuar con 
        //sus metodos(ataques)
        
        Squirtle squirtle = new Squirtle ();
        Charmander charmander = new Charmander ();
        Bulbusor bulba = new Bulbusor ();
        Pikachu pika = new Pikachu ();
        
        //llamamos a los metodos para asignarlos al personaje para 
        //luchar.. nombre.metodo
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        
        
    }
}
