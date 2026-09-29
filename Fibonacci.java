import java.math.BigInteger;

public class Fibonacci {

    public static void generarFibonacci(int n) {
        if (n < 1) {
            System.out.println("Por favor ingresa un número mayor a 0");
            return;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.println(a);
        if (n == 1) {
            System.out.println("Fin de la serie Fibonacci");
            return;
        }

        System.out.println(b);

        for (int i = 3; i <= n; i++) {
            BigInteger c = a.add(b);
            System.out.println(a + " + " + b + " = " + c);
            a = b;
            b = c;
        }

        System.out.println("Fin de la serie Fibonacci");
    }

    public static void main(String[] args) {
        generarFibonacci(500);
    }
}
