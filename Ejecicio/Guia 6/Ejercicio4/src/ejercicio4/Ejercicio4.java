package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    
    public static void main(String[] args) {
       int grados,fara;
       System.out.println("Ingrese los grados ");
       Scanner leer = new Scanner(System.in);
       grados=leer.nextInt();
       fara=32+(9*grados/5);
       System.out.println("Sus "+grados +"ºC es iugal a "+fara+"ºF");
       
    }
    
}
