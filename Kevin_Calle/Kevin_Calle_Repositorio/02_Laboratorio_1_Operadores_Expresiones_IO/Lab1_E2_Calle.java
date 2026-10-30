import java.util.Locale;
import java.util.Scanner;

public class Lab1_E2_Calle {
    public static void main(String[] args) {
        // Estudiante: Kevin Calle | NRC: 37712 | Fecha: 28/10/2026
        // Ejercicio 2: conversion de segundos a horas, minutos y segundos.

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Total de segundos: ");
        int segundosTotales = teclado.nextInt();

        if (segundosTotales < 0) {
            System.out.println(
                "Error: el tiempo no puede ser negativo."
            );
        } else {
            int horasCalculadas = segundosTotales / 3600;
            int minutosCalculados =
                (segundosTotales % 3600) / 60;
            int segundosRestantes = segundosTotales % 60;

            System.out.printf(
                "%d s = %d h %d min %d s%n",
                segundosTotales,
                horasCalculadas,
                minutosCalculados,
                segundosRestantes
            );

            int tiempoReconstruido =
                horasCalculadas * 3600
                + minutosCalculados * 60
                + segundosRestantes;

            System.out.println(
                "Verificacion: " + tiempoReconstruido + " segundos"
            );
        }

        teclado.close();
    }
}