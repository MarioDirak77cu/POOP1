package poop4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu04
 */
public class Punto {
    //Atributos
    int x;
    int y;
    
    //Métodos
    //Método Constructor
    public Punto(){
        //x = 0;
        //y = 0;
    }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    //Método de Acción
    public void imprimirPunto(){
        System.out.println("Punto: ("+x+", "+y+")");
    }
}
