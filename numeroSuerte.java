package programacion;

import java.util.Scanner;

public class numeroSuerte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el día de nacimiento: ");
        int dia = teclado.nextInt();
        System.out.println("Introducir el mes: ");
        int mes = teclado.nextInt();
        System.out.println("Introducir año: ");
        int anio = teclado.nextInt();

        int suma = dia + mes + anio;
        int cifra1 = suma/1000;
        int cifra2 = suma/100%10;
        int cifra3 = suma/10%10;
        int cifra4 = suma%10;

        int numSuerte = cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println("Su número de la suerte es " + numSuerte);
    }

}
