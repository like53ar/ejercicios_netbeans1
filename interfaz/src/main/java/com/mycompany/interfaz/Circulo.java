
package com.mycompany.interfaz;

/**
 *
 * @author Fabian
 * cuando usamos interface no utilizamos extends  sino implements con coma 
 * para insertar otra interfaz
 */
public class  Circulo implements Figura, Rotable, Dibujable {
    private double radio;
    
    // constructor vacio

    public Circulo() {
    }

    // constructor lleno 
        public Circulo(double radio) {
        this.radio = radio;
    }
        
    // interfaz que viene de interfaz
    @Override
    public double calcularArea() {
        double pi= 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
    // interfaz que viene de Rotable
    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando"); 
    }
    // interfaz que viene de Dibujar
    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando ");
    }
            
}
