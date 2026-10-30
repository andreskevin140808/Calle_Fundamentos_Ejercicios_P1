import java.util.Locale;
import java.util.Scanner;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Angulo en grados: ");
        double angulo = sc.nextDouble();

        if (angulo < 0) {
            System.out.println(
                "Error: el angulo no puede ser negativo."
            );
        } else {
            double original = angulo;

            if (angulo > 360) {
                angulo = angulo % 360;
                System.out.printf(
                    "Angulo reducido: %.2f grados%n", angulo
                );
            }

            String tipo;

            if (angulo == 0) {
                tipo = "Nulo";
            } else if (angulo < 90) {
                tipo = "Agudo";
            } else if (angulo == 90) {
                tipo = "Recto";
            } else if (angulo < 180) {
                tipo = "Obtuso";
            } else if (angulo == 180) {
                tipo = "Llano";
            } else if (angulo < 360) {
                tipo = "Concavo";
            } else {
                tipo = "Completo";
            }

            System.out.printf(
                "Angulo %.2f -> %s%n", original, tipo
            );
        }

        sc.close();
    }
}