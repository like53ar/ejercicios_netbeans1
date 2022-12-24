
package com.mycompany.ejercicio_integrador;

/**
 *es un pokemon asi que extends todas los metodos de la clase abstracta
 * @author Fabian
 */
public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y uso mi ataque placaje");   
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y uso mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y uso mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmande y ataco con Punio Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmande y ataco con Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmande y ataco con Ascuas");
    }
    
}
