// Nombre completo: Kevin Andres Calle Arteaga
// NRC: 37712
// Fecha: 29/10/2026
// Enunciado: Imprimir la tabla de multiplicar del 1 al 10 en forma de
// matriz de 10 filas por 10 columnas, con cada valor alineado a la
// derecha en un ancho fijo, usando dos ciclos for anidados.

public class Lab2_E1_Calle {

    public static void main(String[] args) {
        // Ciclo externo: controla las filas (multiplicando i)
        for (int i = 1; i <= 10; i++) {
            // Ciclo interno: controla las columnas (multiplicando j)
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
}