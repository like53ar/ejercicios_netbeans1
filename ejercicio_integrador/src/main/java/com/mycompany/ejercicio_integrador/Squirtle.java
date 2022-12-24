
package com.mycompany.ejercicio_integrador;

/**
 *es un pokemon asi que extends todas los metodos de la clase abstracta
 * @author Fabian
 */
public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y te ataco con placaje ");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y te ataco con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y te ataco con mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y uso Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y uso Burbuja ");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y uso Pistola de Agua");
    }
    
}
