import java.util.Scanner;

// Autor: Kevin Calle
// Ejercicio en clase 1: suma de los n primeros números naturales.
public class Clase_E1_SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número natural n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: n debe ser mayor o igual que cero.");
        } else {
            long suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i;
            }

            long formula = (long) n * ((long) n + 1) / 2;
            System.out.println("Suma mediante ciclo: " + suma);
            System.out.println("Suma mediante fórmula: " + formula);
            System.out.println("¿Coinciden? " + (suma == formula));
        }

        sc.close();
    }
}
