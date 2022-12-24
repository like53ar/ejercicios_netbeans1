
package com.mycompany.ejercicio_integrador;

/**
 *
 * @author Fabian
 *  es un pokemon asi que extends todas los metodos de la 
 * clase abstracta e implementamos el ataque iplanta
 * 
 */
public class Bulbusor extends Pokemon implements IPlanta {

    public Bulbusor() {
    }
        
    @Override
    protected void atacarPlacaje() {
        System.out.println("");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbusar y uso mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbusar y uso mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola ssoy Bulbusar uso Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbusar uso Paralizar");
    }
            
}
