package Complejas;
import java.lang.Math;

public class Calcu {
    public int factorial(int a) {
        int f=1;
        for(int i=1; i<=a; i++)
            f = f*i;
        return f;
    }

    public double potencia(int a, int b) {
        return Math.pow(a, b);
    }
}
