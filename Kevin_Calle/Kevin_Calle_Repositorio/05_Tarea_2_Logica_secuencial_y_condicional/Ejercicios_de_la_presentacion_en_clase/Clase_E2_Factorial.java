import java.util.Scanner;

// Autor: Kevin Calle
// Ejercicio en clase 2: factorial validando n con do-while.
public class Clase_E2_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese n entre 0 y 20: ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor inválido. Intente nuevamente.");
            }
        } while (n < 0 || n > 20);

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
        sc.close();
    }
}
