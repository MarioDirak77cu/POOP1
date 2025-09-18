/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu04
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto();        
        punto1.imprimirPunto();
        punto1.x = 4;
        punto1.y = 7;
        punto1.imprimirPunto();
        
        Punto punto2 = new Punto(10, 88);
        punto2.imprimirPunto();
        
        System.out.println("Punto 2: x = "+punto2.x);
        System.out.println("Punto 2: y = "+punto2.y+"\n");
        
        Carro carro1 = new Carro();
        carro1.imprimirCarro();
        carro1.marca = "Nissan";
        carro1.color = "Rojo";
        carro1.anio = 2023;
        carro1.numPuertas = 4;
        carro1.imprimirCarro();
        
        Carro carro2 = new Carro("Chevrolet", 2020, "Negro", 4);
        carro2.imprimirCarro();
        carro1.avanzar();
        carro1.frenar();
        carro1.sonar();
        carro1.retroceder();
        
        System.out.println("\nProfesor 1");
        Profesor profe1 = new Profesor();
        profe1.materia = "Calculo Diferencial";
        profe1.horario = 13.15;
        profe1.division = "DCB";
        profe1.universidad = "UNAM";
        profe1.imprimirProfesor();
        profe1.pasarLista();
        profe1.calificarTareas();
        profe1.hacerExamen();
        
        System.out.println("\nProfesor 2");
        Profesor profe2 = new Profesor("Quimica", 12.30, "DCB", "UNAM");
        profe2.imprimirProfesor();
        profe2.pasarLista();
        profe2.calificarTareas();
        profe2.hacerExamen();
        
        
    }
    
}
