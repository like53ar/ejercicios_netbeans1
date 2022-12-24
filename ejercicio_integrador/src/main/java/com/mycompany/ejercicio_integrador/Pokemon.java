
package com.mycompany.ejercicio_integrador;

/**
 *
 * @author Fabian
 */
public abstract class Pokemon {
    
    // creamos la clase abstracta pokemon y lo ponemos protected
    //para que solo las hijas puedan usar
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    // ataques de los pokemones
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    // clase de pokemones creo interfase, porque solo me interesa 
    //lo que hace no lo que es o que hace
    
    
    
}
