import java.util.Locale;
import java.util.Scanner;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Resistencia 1 (ohm): ");
        double r1 = sc.nextDouble();

        System.out.print("Resistencia 2 (ohm): ");
        double r2 = sc.nextDouble();

        System.out.print("Conexion (S = serie, P = paralelo): ");
        char tipo = Character.toUpperCase(sc.next().charAt(0));

        if (r1 <= 0 || r2 <= 0) {
            System.out.println(
                "Error: las resistencias deben ser positivas."
            );
        } else {
            double req;

            switch (tipo) {
                case 'S':
                    req = r1 + r2;
                    System.out.printf(
                        "Resistencia equivalente (serie) = %.2f ohm%n",
                        req
                    );
                    break;

                case 'P':
                    req = (r1 * r2) / (r1 + r2);
                    System.out.printf(
                        "Resistencia equivalente (paralelo) = %.2f ohm%n",
                        req
                    );
                    break;

                default:
                    System.out.println(
                        "Error: tipo de conexion invalido (use S o P)."
                    );
            }
        }

        sc.close();
    }
}