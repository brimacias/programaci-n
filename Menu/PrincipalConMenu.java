package Menu;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


/**
 *
 * @author mrnovoa
 */
public class PrincipalConMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
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
                    //OP1
                    System.out.println("Operaciones Operacion1");
                    break;
                case 2:
                    //OP2
                    System.out.println("Operaciones Operacion2");
                    break;
                case 3:
                    //OP3
                    System.out.println("Operaciones Operacion3");
                    break;
                case 0:
                    fin();
                    break;
                default:
                    mensajePorDefecto();
                    break;
            }
        } while (op != 0);

        //Cierre de la conexión
        input.close();
    }

    public static byte leerByte(Scanner sc) {

        byte valor = 0;
        boolean correcto;

        correcto = true;

        do {
            valor = sc.nextByte();
            if (valor<0||valor>3) {
                System.out.println("ERROR. No ha introducido un valor válido. Introduzca un número: ");
                correcto=false;
            }
            else correcto=true;
        } while (!correcto);

        return valor;

    }

    public static void menuPrincipal() {
        System.out.println("----------------------------------------------\n"
                + "\t\t\tPROYECTO NOMBRE\n\n"
                + "1.-Operaciones 1\n"
                + "2.-Operaciones 2\n"
                + "3.-Operaciones 3\n\n"
                + "0.-SALIR");
    }

    public static void fin() {
        System.out.println("PROGRAMA FINALIZADO");
    }

    public static void mensajePorDefecto() {
        System.out.println("No ha introducido ninguna de las opciones.\n");
    }
}
