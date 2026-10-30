import java.util.Locale;
import java.util.Scanner;

public class T2_P2_Descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRECIO = 8.50;
        final double IVA = 0.15;
        final double DESC_MEDIO = 0.05;
        final double DESC_ALTO = 0.10;

        System.out.print("Numero de sacos: ");
        int sacos = sc.nextInt();

        if (sacos < 1) {
            System.out.println(
                "Error: debe comprar al menos 1 saco."
            );
        } else {
            double subtotal = sacos * PRECIO;
            double tasaDesc;

            if (sacos <= 20) {
                tasaDesc = 0;
            } else if (sacos <= 50) {
                tasaDesc = DESC_MEDIO;
            } else {
                tasaDesc = DESC_ALTO;
            }

            double descuento = subtotal * tasaDesc;
            double neto = subtotal - descuento;
            double iva = neto * IVA;
            double total = neto + iva;

            System.out.printf("Subtotal:   $%.2f%n", subtotal);
            System.out.printf(
                "Descuento:  $%.2f (%.0f%%)%n",
                descuento, tasaDesc * 100
            );
            System.out.printf("Neto:       $%.2f%n", neto);
            System.out.printf("IVA 15%%:    $%.2f%n", iva);
            System.out.printf("TOTAL:      $%.2f%n", total);
        }

        sc.close();
    }
}