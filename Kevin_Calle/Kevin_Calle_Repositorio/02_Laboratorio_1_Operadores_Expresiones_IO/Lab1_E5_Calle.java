import java.util.Locale;

public class Lab1_E5_Calle {
    public static void main(String[] args) {
        // Estudiante: Kevin Calle | NRC: 37712 | Fecha: 28/10/2026
        // Ejercicio 5: evaluacion y verificacion de expresiones.

        Locale.setDefault(Locale.US);

        int a = 9;
        int b = 4;

        int expresionUno = a / b + a % b * 2;

        boolean expresionDos =
            10 - 3 * 2 > 3 && 5 % 2 == 1;

        double expresionTres =
            (double) 7 / 2 + 7 / 2;

        boolean expresionCuatro =
            !(4 >= 4) || 2 * 3 != 6;

        System.out.println(
            "a / b + a % b * 2 = " + expresionUno
        );

        System.out.println(
            "10 - 3 * 2 > 3 && 5 % 2 == 1 = " + expresionDos
        );

        System.out.println(
            "(double) 7 / 2 + 7 / 2 = " + expresionTres
        );

        System.out.println(
            "!(4 >= 4) || 2 * 3 != 6 = " + expresionCuatro
        );
    }
}