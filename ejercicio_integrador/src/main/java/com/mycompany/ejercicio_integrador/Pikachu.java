
package com.mycompany.ejercicio_integrador;

/**
 *s un pokemon asi que extends todas los metodos de la clase 
 * abstracta e implementa Iagua
 * @author Fabian
 */
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
       

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hoola soy Pikachu uso mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu uso mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu uso mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu uso mi Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu uso mi Punio");
               
    }
  
}
