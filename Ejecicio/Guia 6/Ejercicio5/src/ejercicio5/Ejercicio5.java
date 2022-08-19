package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero que desea multiplicar, triplicar y su raiz");
        num=leer.nextInt();
        System.out.println("El doble de su numero es "+(num*2));
        System.out.println("El triple de su numero es "+(num*3));
        System.out.println("La raiz de su numero es "+Math.sqrt(num));
    }
    
}
