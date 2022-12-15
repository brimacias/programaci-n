import java.util.Scanner;

import static Menu.PrincipalConMenu.*;

public class Numero_Suerte {
    public static long numeroIntroducido;
    public static int afortunados = 0;
    public static int noAfortunados = 0;
    public static long copia;

    public static void main(String[] args) {
        menu();
    }

    public static void introducirDatos(){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        numeroIntroducido = Long.parseLong(s.nextLine());
        copia = numeroIntroducido;
    }

    public static void calculos(){
        while (numeroIntroducido > 0) {
            int digito = (int)(numeroIntroducido % 10);
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afortunados++;
            } else {
                noAfortunados++;
            }
            numeroIntroducido /= 10;
        }

        if (afortunados > noAfortunados) {
            System.out.println("El " + copia + " es un número afortunado.");
        } else {
            System.out.println("El " + copia + " no es un número afortunado.");
        }
    }
    public static void menu (){
        Scanner input = new Scanner(System.in);

        System.out.println("Inicialización del Sistema");

        byte op = 0;
        do {
            menuPrincipal();
            op = leerByte(input);
            switch (op) {
                case 1:
                    introducirDatos();
                    break;
                case 2:
                    calculos();
                    break;
                case 0:
                    fin();
                    break;
                default:
                    mensajePorDefecto();
                    break;
            }
        } while (op != 0);

        input.close();
    }
    public static void menuPrincipal() {
        System.out.println("----------------------------------------------\n"
                + "\t\t\tNUMERO DE LA SUERTE\n\n"
                + "1.-Introducir número\n"
                + "2.-Valorar número\n"
                + "0.-SALIR");
    }
}