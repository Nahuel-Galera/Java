
 
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
        
      double nume;
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese su numero para identificar ");
      nume = leer.nextDouble();
    if (nume%2==0){
        System.out.println("Su numero es par");
    }else if (nume%2!=0){
        System.out.println("Su numero es inpar ");
    }
      
    }
    
}
