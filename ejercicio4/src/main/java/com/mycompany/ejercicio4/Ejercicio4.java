/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Crear una clase llamada VideoJuego, que tenga los siguientes atributos: Codigo, Titulo, Consola, Cantidad de
 * Jugadores, categoria (tener en cuenta todos sus atributos, constructores, metodos getters y setters)
 * .- crear una Arraylist para cada tipo de Video Juego y guardarlos en la collection
 * .- Recorrer la Arralist creada y mostrar por pantalla el titulo, consola y cantidad de jugadores de 
 * los videojuegos almacenados
 * .- Cambiar el nombre y la cantiad de jugadores de dos videojuegos, mostrar por apantalla los datos de todos los videojusgos luego del cambio
 * .- Recorrer la Arraylist y mostrar por pantalla unicamente los vcideojuegos que sean de la consola nintendo 64
 * 
 * 
 * @author fabia
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       
        //creo Arraylist de videojuego, empiezo con List 
        
       List <VideoJuego> listaVideojuegos =new ArrayList <VideoJuego>();
       
       //crear 5 videojuegos y lo agrego a la collection, gracias al cosntructor por pparametros creando el objeto
       
       VideoJuego video1 = new VideoJuego(123,"chuki","Nintendo64",4,"Plataforma");
       VideoJuego video2 = new VideoJuego(23,"chu","Nintendo64",4,"Plataforma");
       VideoJuego video3 = new VideoJuego(523,"Age of Empire","Nintendo64",2,"PC");
       VideoJuego video4 = new VideoJuego(323,"chi","PlayStation",1,"Plataforma");
       VideoJuego video5 = new VideoJuego(423,"cuki","Nintendo64",6,"Plataforma");
       
       
       
       //agrego los videojuegos a la lista
       
       listaVideojuegos.add(video1);
       listaVideojuegos.add(video2);
       listaVideojuegos.add(video3);
       listaVideojuegos.add(video4);
       listaVideojuegos.add(video5);
       
       
       //Recorrer la Arralist creada y mostrar por pantalla el titulo, consola
       // y cantidad de jugadores de 
       // los videojuegos almacenados con FOREACH
       
       for (VideoJuego video : listaVideojuegos){
           System.out.println("Titulo   " + video.getTitulo()
                   + "Consola  " + video.getConsola() + "Cantidad de Jugadores " 
                   + video.getCantJugadores());
                
       }
       
        System.out.println("-----------------------------------------");
       
       //Cambiar el nombre y la cantiad de jugadores de dos videojuegos, 
       //mostrar por apantalla los datos de todos los videojusgos luego del cambio
       //con el metodo set 
       
       video1.setTitulo("Agua");
       video1.setCantJugadores(90);
       video2.setTitulo("MarioKArt");
       video2.setCantJugadores(50);
       
       //Recorrer la Arraylist y mostrar por pantalla unicamente 
       //los vcideojuegos que sean de la consola nintendo 64
       //cada metodo lo llamamos con un .equal no el igual igual
       
       for (VideoJuego video : listaVideojuegos){
           if (video.getConsola().contentEquals("Nintendo 64")) {
               System.out.println(video.toString());
               
           }
           
       }
              
    }
}
