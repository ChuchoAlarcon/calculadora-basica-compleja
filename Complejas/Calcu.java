package Complejas;

public class Calcu {

    public Calcu(){

    }
    
    public int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++){
            fact *= i; 
        }
        return fact;
    }

    public int potencia(int a, int b) {
        int pot = 1;
        for(int i = 0; i < b; i++ ){
            pot *= a;
        }
        return pot;
    }
}
