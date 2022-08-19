package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

   
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrse la frase ");
        frase=leer.next();
        if (frase.toLowerCase().equals("eureka")==true){
            System.out.println("Es correcto");
        }else{
            System.out.println("Es incorrecto");
            
        }
    }
    
}