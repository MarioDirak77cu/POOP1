/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Dirak
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Circulo");
        Circulo circulo1 = new Circulo(3.1416f, 5.236f);
        //llamar al método para calcular el perimetro
        float perimetroCalculado = circulo1.calcularPerimetro();
        
        System.out.println("El perimetro del circulo es: "+ perimetroCalculado);
        circulo1.imprimirCirculo();
        
        float areaCalculada = circulo1.calcularArea();
        
        System.out.println("El area del ciculo es: "+areaCalculada);
        circulo1.imprimirCirculo();
        
        
        
        
    }
    
}
