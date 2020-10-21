package Basicas;

import java.util.Scanner;

public class Test {
    
    
    
    

    public static void main(String[] args) {

        Calculadora primero = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        System.out.println("(1)SUMA ; (2)RESTA ; (3)PRODUCTO ; (4) DIVISION");
        int r = teclado.nextInt();
        System.out.print("ingrese el 1er # :");
        int a = teclado.nextInt();
        System.out.print("ingrese el 2do # : ");
        int b = teclado.nextInt();
        
        switch (r){
            case 1:
                System.out.println("la resp es: "+primero.suma(a, b));
                break;
            case 2:
                System.out.println("la resp es: "+primero.resta(a, b));
                break;
            case 3:
                System.out.println("la resp es: "+primero.multiplicacion(a, b));
                break;
            case 4:
                System.out.println("la resp es: "+primero.division(a, b));
                break;
        }
    }
}
