import java.util.Scanner;

public class cd {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*int num = teclado.nextInt();*/
        /**
         * System.out.println("Escriba el nombre del programador: ");
         * System.out.println("¿En qué lenguaje programa? ");
         * System.out.println("El programa se llama " + Lnombre);
         * System.out.println("Programa en " + Llenguaje);
         */

        String Lnombre/* = teclado.nextLine()*/; // TODO: revisar lectura de ints como chars

        String Llenguaje/* = teclado.nextLine()*/;


        cdProgramador p1 = new cdProgramador("Peggy","Java");
/**
 * System.out.println(p1.nombre + " programa en " + p1.lenguaje);
 *         System.out.println(p1);
 */
        Lnombre = p1.nombre;
        Llenguaje = p1.lenguaje;
        System.out.println(p1.toString());

        cdComercial c1 = new cdComercial("Eliiiiza","Castellano",4);
        System.out.println(c1.toString());
    }
}
