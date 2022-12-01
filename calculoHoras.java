import java.util.Scanner;

public class calculoHoras {
    /**
     * Realiza un programa que calcule ls horas transcurridas entre dos horas de dos días de la semana.
     * No se tendrán en cuenta los minutos ni los segundos.
     * El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (lunes a domingo).
     * Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al 1º.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas = 0;
        int horastotal = 0;
        System.out.println("Introducir el número del primer día: ");
        int primero = teclado.nextInt();
        System.out.println("Introducir la hora del primer día: ");
        int primera_hora = teclado.nextInt();
        System.out.println("Introducir el número de un día posterior al anterior: ");
        int posterior = teclado.nextInt();
        System.out.println("Introducir la hora del segundo día: ");
        int segunda_hora = teclado.nextInt();

        //Bucle primer día
        int horas_primer_dia = 23 - primera_hora;
        int horas_segundo_dia = 23 - segunda_hora;
        do {
            //leer la hora
            if (primera_hora < 0 || primera_hora > 23) {
                boolean horaCorrecta = false;
            } else {
                switch (primero) {
                    case 1:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                    case 2:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                    case 3:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                    case 4:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                    case 5:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                    case 6:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                    case 7:
                        horas = (posterior - primero) * 24;
                        horastotal = horas + horas_primer_dia + horas_segundo_dia;

                }
            }

        //Bucle horas primer día
      

            //Bucle segundo día

            switch (primero) {
                case 1:


                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    primero = 7;

            }
        } while ();

        //Bucle horas segundo día

        do {
            //leer la hora
            if (primera_hora < 0 || primera_hora > 23) {
                boolean horaCorrecta = false;
            }
        }while ();

        //Validación del día:
        //segundo >= primero;

        //Calculo de las horas
        int calculoI = ((posterior * 24) + segunda_hora) - ((primero * 24) + primera_hora);

    }
}
