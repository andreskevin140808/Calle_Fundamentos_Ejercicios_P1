// Autor: Kevin Andrés Calle Arteaga
import java.util.Locale;
import java.util.Scanner;

public class T1_P5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su promedio: ");
        double promedio = sc.nextDouble();

        System.out.println(edad <= 25 && promedio >= 8.5);

        sc.close();
    }
}