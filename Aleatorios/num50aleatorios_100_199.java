package Aleatorios;

public class num50aleatorios_100_199 {
    public static void main(String[] args) {
        int numero = 0;
        int maximo = 0;
        int minimo = 100;
        int suma = 0;
        for (int i = 0;i<50;i++) {
            numero = (int)Math.floor(Math.random()*(199-150+1)+150);
            System.out.print(numero + " ");
            suma = suma + numero;

            if (numero > maximo) {
                maximo = numero;
            } else if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("\nMáximo: " + maximo +
                            "\nMínimo: " + minimo +
                            "\nMedia: " + (suma/50));
    }
}
