/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu04
 */
public class Carro {
    String marca;
    int anio;
    String color;
    int numPuertas;
    
    //Método Constructor
    public Carro(){
        
    }
    
    public Carro(String marca, int anio, String color, int numPuertas){
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.numPuertas = numPuertas;
    }
    //Método de acción
    public void imprimirCarro(){
        System.out.println("Marca:  "+marca);
        System.out.println("Anio:   "+anio);
        System.out.println("Color:  "+color);
        System.out.println("Puerta: "+numPuertas+"\n");
    }
    public void avanzar(){
        System.out.println("El carro "+marca+" esta avazando...");
    }
    
    public void frenar(){
        System.out.println("El carro "+marca+" se freno...");
    }
    
    public void sonar(){
        System.out.println("El carro "+marca+" esta sonando...");
    }
    
    public void retroceder(){
        System.out.println("El carro "+marca+" esta retrocediendo...");
    }
}
