/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_futuro;

/**
 *
 * @author Cristian
 */
public class Proyecto_futuro {

    /**
     * @param arg
     */
    public static void main(String[] args) {
        
    args[0]="Cristian Ramirez Martinez";
    System.out.println("Estudiante " + args[0] + " : ");
    System.out.println(veredicto("5","3"));
    }
    
    static String veredicto(String valor1, String valor2) {
        
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
