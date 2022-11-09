package programacion;

import java.util.Scanner;

public class multiplosDe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir 5 números: ");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        double num4 = teclado.nextDouble();
        double num5 = teclado.nextDouble();

        boolean multiplo;
        if (num1 % 3 == 0) {
            multiplo = true;
            System.out.println(multiplo);
        } else if (num2 % 3 == 0) {
            multiplo = true;
            System.out.println(multiplo);
        } else if (num3 % 3 == 0) {
            multiplo = true;
            System.out.println(multiplo);
        } else if (num4 % 3 == 0) {
            multiplo = true;
            System.out.println(multiplo);
        } else if (num5 % 3 == 0) {
            multiplo = true;
            System.out.println(multiplo);
        } else {
            multiplo = false;
            System.out.println(multiplo + "\nNo hay ningun número múltiplo de 3.");
        }
    }
}

