import java.util.Scanner;

public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero a: ");
        double a = sc.nextDouble();

        System.out.print("Numero b: ");
        double b = sc.nextDouble();

        System.out.print("Numero c: ");
        double c = sc.nextDouble();

        if (a == b || a == c || b == c) {
            System.out.println(
                "Error: los numeros deben ser distintos."
            );
        } else {
            double aux;

            if (a < b) {
                aux = a;
                a = b;
                b = aux;
            }

            if (a < c) {
                aux = a;
                a = c;
                c = aux;
            }

            if (b < c) {
                aux = b;
                b = c;
                c = aux;
            }

            System.out.println(
                "De mayor a menor: " + a + ", " + b + ", " + c
            );
        }

        sc.close();
    }
}