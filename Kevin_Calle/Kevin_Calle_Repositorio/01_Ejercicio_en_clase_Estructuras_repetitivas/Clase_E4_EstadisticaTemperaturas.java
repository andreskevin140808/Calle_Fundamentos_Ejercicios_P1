import java.util.Locale;
import java.util.Scanner;

// Autor: Kevin Calle
// Ejercicio en clase 4: temperaturas hasta el centinela -999.
public class Clase_E4_EstadisticaTemperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double suma = 0;
        double mayor = 0;
        double menor = 0;

        System.out.print("Ingrese una temperatura (-999 para terminar): ");
        double temperatura = sc.nextDouble();

        while (temperatura != -999) {
            if (contador == 0) {
                mayor = temperatura;
                menor = temperatura;
            } else {
                if (temperatura > mayor) mayor = temperatura;
                if (temperatura < menor) menor = temperatura;
            }
            suma += temperatura;
            contador++;

            System.out.print("Ingrese otra temperatura (-999 para terminar): ");
            temperatura = sc.nextDouble();
        }

        if (contador == 0) {
            System.out.println("No se ingresaron temperaturas.");
        } else {
            System.out.println("Lecturas: " + contador);
            System.out.printf("Mayor: %.2f%n", mayor);
            System.out.printf("Menor: %.2f%n", menor);
            System.out.printf("Promedio: %.2f%n", suma / contador);
        }

        sc.close();
    }
}
