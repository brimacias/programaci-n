package programacion;

import java.util.Scanner;

public class leerHasta0 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir número: ");
        double num = teclado.nextDouble();
        while (num != 0) {
            System.out.println("Introducir otro número: ");
            num = teclado.nextDouble();
        }
    }
}
