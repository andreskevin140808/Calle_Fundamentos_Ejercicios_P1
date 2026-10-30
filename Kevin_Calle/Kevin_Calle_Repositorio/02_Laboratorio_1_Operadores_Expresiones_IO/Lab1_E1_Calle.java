import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Calle {
    public static void main(String[] args) {
        // Estudiante: Kevin Calle | NRC: 37712 | Fecha: 28/10/2026
        // Ejercicio 1: conversion de Celsius a Fahrenheit y Kelvin.

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Temperatura en Celsius: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%-12s%10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s%10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s%10.2f%n", "Kelvin", kelvin);

        teclado.close();
    }
}