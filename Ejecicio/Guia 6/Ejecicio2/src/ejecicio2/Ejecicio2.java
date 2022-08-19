/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio2;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejecicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        System.out.print("Ingrese su numbre");
        Scanner leer = new Scanner(System.in);
        nombre=leer.next();
        System.out.print("Su nombre es "+nombre);
    }
    
}
