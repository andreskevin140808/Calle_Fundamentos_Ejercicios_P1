// Autor: Kevin Andrés Calle Arteaga

public class T1_P6_Asignacion {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Despues de int x = 4: " + x);

        x *= 3;
        System.out.println("Despues de x *= 3: " + x);

        x %= 5;
        System.out.println("Despues de x %= 5: " + x);

        x += x++;
        System.out.println("Despues de x += x++: " + x);
    }
}