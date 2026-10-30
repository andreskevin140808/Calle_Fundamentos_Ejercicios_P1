// Nombre completo: Kevin Andres Calle Arteaga
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: El programa genera un numero aleatorio entre 1 y 100.
// El usuario tiene 7 intentos; en cada uno se indica "mas alto" o
// "mas bajo". Al final se informa si acerto y en cuantos intentos,
// o cual era el numero si perdio.

import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Calle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();

        int numeroSecreto = azar.nextInt(100) + 1; // numero entre 1 y 100
        final int MAX_INTENTOS = 7;
        int intentosUsados = 0;
        boolean acerto = false;
        int numeroIngresado;

        // Linea de prueba temporal para verificar los mensajes (se retira al final):
        // System.out.println("[DEBUG] numero secreto = " + numeroSecreto);

        // do-while: se ejecuta al menos una vez y continua mientras no
        // acierte y aun le queden intentos disponibles.
        do {
            System.out.print("Intento " + (intentosUsados + 1) + " de " + MAX_INTENTOS + ". Ingrese un numero (1-100): ");
            numeroIngresado = sc.nextInt();
            intentosUsados++;

            if (numeroIngresado == numeroSecreto) {
                acerto = true;
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Mas bajo.");
            }

        } while (!acerto && intentosUsados < MAX_INTENTOS);

        if (acerto) {
            System.out.println("Felicidades, acerto el numero " + numeroSecreto + " en " + intentosUsados + " intento(s).");
        } else {
            System.out.println("Se acabaron los intentos. El numero era: " + numeroSecreto);
        }

        sc.close();
    }
}