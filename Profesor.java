/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu04
 */
public class Profesor {
    String materia;
    double horario;
    String division;
    String universidad;
    
    //Método Constructor
    public Profesor(){
        
    }
    public Profesor(String materia, double horario, String division, String universidad){
        this.materia = materia;
        this.horario = horario;
        this.division = division;
        this.universidad = universidad;
    }
    
    public void imprimirProfesor(){
        System.out.println("Materia que imparte:         "+materia);
        System.out.println("Horario de clase:            "+horario+ " hrs");
        System.out.println("Division a la que pertenece: "+division);
        System.out.println("Universidad donde trabaja:   "+universidad);
    }
    
    public void pasarLista(){
        System.out.println("El profe esta pasando lista...");
    }
    
    public void calificarTareas(){
        System.out.println("El profe esta calificando tarea...");
    }
    
    public void hacerExamen(){
        System.out.println("El profe esta haciendo examen....");
    }
}
