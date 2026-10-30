import java.util.Locale;
import java.util.Scanner;

public class Lab1_E3_Calle {
    public static void main(String[] args) {
        // Estudiante: Kevin Calle | NRC: 37712 | Fecha: 28/10/2026
        // Ejercicio 3: suma, inversion y paridad de cuatro cifras.

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero de cuatro cifras (1000-9999): ");
        int numeroIngresado = teclado.nextInt();

        if (numeroIngresado < 1000 || numeroIngresado > 9999) {
            System.out.println(
                "Error: debe ingresar un numero de cuatro cifras."
            );
        } else {
            int cifraMiles = numeroIngresado / 1000;
            int cifraCentenas = (numeroIngresado / 100) % 10;
            int cifraDecenas = (numeroIngresado / 10) % 10;
            int cifraUnidades = numeroIngresado % 10;

            int sumaCifras = cifraMiles + cifraCentenas
                + cifraDecenas + cifraUnidades;

            int numeroInvertido = cifraUnidades * 1000
                + cifraDecenas * 100
                + cifraCentenas * 10
                + cifraMiles;

            boolean esPar = numeroIngresado % 2 == 0;

            System.out.println("Suma de cifras: " + sumaCifras);
            System.out.println("Invertido: " + numeroInvertido);
            System.out.println("Es par: " + esPar);
        }

        teclado.close();
    }
}