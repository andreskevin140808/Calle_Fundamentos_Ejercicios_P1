// Nombre completo: Kevin Andres Calle Arteaga
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Construir un menu repetitivo (do-while + switch) con saldo
// inicial de $500: 1) consultar, 2) depositar, 3) retirar, 0) salir.
// No se permiten depositos ni retiros con montos negativos o cero, ni
// retiros mayores que el saldo.

import java.util.Scanner;

public class Lab2_E5_Calle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 500.00;
        int opcion;

        // do-while: el menu debe mostrarse al menos una vez
        do {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    if (montoDeposito > 0) {
                        saldo += montoDeposito;
                        System.out.println("Deposito aceptado.");
                        System.out.printf("Saldo: $%.2f%n", saldo);
                    } else {
                        System.out.println("Fondos insuficientes o monto invalido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    if (montoRetiro > 0 && montoRetiro <= saldo) {
                        saldo -= montoRetiro;
                        System.out.println("Retiro aceptado.");
                        System.out.printf("Saldo: $%.2f%n", saldo);
                    } else {
                        System.out.println("Fondos insuficientes o monto invalido.");
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}