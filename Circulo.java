/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Dirak
 */
public class Circulo {
    float pi;
    float radio;
    
    public Circulo(){
    }    
    public Circulo (float pi, float radio){
        this.pi = pi;
        this.radio = radio;
    }
    //Método para calcular el perimetro 
    public float calcularPerimetro(){
        return 2 * pi * radio;
    }
    //Método para calcular el área
    public float calcularArea(){
        return pi * radio * radio;
    }
    //Método en acción 
    public void imprimirCirculo(){
        System.out.println("("+pi+", "+radio+")");
    }
}
