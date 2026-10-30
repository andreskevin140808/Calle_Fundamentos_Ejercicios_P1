// Nombre completo: Kevin Andres Calle Arteaga
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Leer lecturas de temperatura de un sensor hasta ingresar un
// valor negativo (centinela). Mostrar cantidad de lecturas validas,
// promedio, maximo y minimo con 2 decimales, sin dividir para cero.

import java.util.Scanner;

public class Lab2_E2_Calle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorLecturas = 0;      // cuenta cuantas lecturas validas se ingresaron
        double acumuladorTemperaturas = 0; // suma de todas las lecturas validas
        double temperaturaMaxima = 0;
        double temperaturaMinima = 0;

        System.out.println("Ingrese lecturas de temperatura (ingrese un valor negativo para terminar):");
        double lectura = sc.nextDouble();

        // while con centinela: se repite mientras la lectura no sea negativa
        while (lectura >= 0) {
            contadorLecturas++;
            acumuladorTemperaturas += lectura;

            // La minima se inicializa con la PRIMERA lectura valida,
            // no con 0, para que siempre pueda actualizarse correctamente.
            if (contadorLecturas == 1) {
                temperaturaMaxima = lectura;
                temperaturaMinima = lectura;
            } else {
                if (lectura > temperaturaMaxima) {
                    temperaturaMaxima = lectura;
                }
                if (lectura < temperaturaMinima) {
                    temperaturaMinima = lectura;
                }
            }

            System.out.print("Ingrese otra lectura (negativo para terminar): ");
            lectura = sc.nextDouble();
        }

        // Se evita la division para cero controlando si hubo lecturas
        if (contadorLecturas > 0) {
            double promedio = acumuladorTemperaturas / contadorLecturas;
            System.out.printf("Lecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n",
                    contadorLecturas, promedio, temperaturaMaxima, temperaturaMinima);
        } else {
            System.out.println("No se ingresaron lecturas validas. No se muestran estadisticas.");
        }

        sc.close();
    }
}