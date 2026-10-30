// Nombre completo: Kevin Andres Calle Arteaga
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Leer un numero impar n y dibujar un rombo de n filas.
// Validar con do-while que n sea impar y positivo, repitiendo la
// lectura si no lo es.

import java.util.Scanner;

public class Lab2_E4_Calle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // do-while: se pide el dato al menos una vez y se repite
        // mientras no sea un numero positivo e impar.
        do {
            System.out.print("Ingrese un numero impar y positivo para el tamanio del rombo: ");
            n = sc.nextInt();
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Valor invalido. Debe ser positivo e impar.");
            }
        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2; // fila central (division entera)

        // Parte superior + fila central: filas 0 .. mitad
        for (int fila = 0; fila <= mitad; fila++) {
            imprimirFila(fila, mitad);
        }

        // Parte inferior: filas mitad-1 .. 0 (espejo de la superior)
        for (int fila = mitad - 1; fila >= 0; fila--) {
            imprimirFila(fila, mitad);
        }

        sc.close();
    }

    // Imprime una fila del rombo: espacios a la izquierda + asteriscos
    private static void imprimirFila(int fila, int mitad) {
        int espacios = mitad - fila;
        int asteriscos = 2 * fila + 1;

        for (int e = 1; e <= espacios; e++) {
            System.out.print(" ");
        }
        for (int a = 1; a <= asteriscos; a++) {
            System.out.print("*");
        }
        System.out.println();
    }
}