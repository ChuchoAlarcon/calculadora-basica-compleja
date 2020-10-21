package Complejas;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        
        Calcu primero = new Calcu();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("(1) POTENCIA;  (2) FACTORIAL");
        
        int r = teclado.nextInt();
        if(r==1){
            System.out.print("Ingrese la base:");
            int a = teclado.nextInt();
            System.out.print("Ingrese el exponente:");
            int b = teclado.nextInt();
            System.out.print("la resp es: "+primero.potencia(a, b));
        }else{
            System.out.print("ingrese el numero: ");
            int a = teclado.nextInt();
            System.out.print("la resp es: "+primero.factorial(a));
        }
            
    }
}
