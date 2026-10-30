import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Calle {
    public static void main(String[] args) {
        // Estudiante: Kevin Calle | NRC: 37712 | Fecha: 28/10/2026
        // Ejercicio 4: calculo de factura con IVA del 15 por ciento.

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        final double PORCENTAJE_IVA = 0.15;

        System.out.print("Nombre del producto: ");
        String nombreProducto = teclado.nextLine();

        System.out.print("Cantidad: ");
        int cantidadProductos = teclado.nextInt();

        System.out.print("Precio unitario: ");
        double precioUnitario = teclado.nextDouble();

        if (cantidadProductos <= 0 || precioUnitario <= 0) {
            System.out.println(
                "Error: cantidad y precio deben ser positivos."
            );
        } else {
            double subtotal = cantidadProductos * precioUnitario;
            double valorIVA = subtotal * PORCENTAJE_IVA;
            double totalPagar = subtotal + valorIVA;

            System.out.println();
            System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
            System.out.printf("%-25s%10.2f%n", "IVA 15%", valorIVA);
            System.out.printf("%-25s%10.2f%n", "TOTAL", totalPagar);
        }

        teclado.close();
    }
}