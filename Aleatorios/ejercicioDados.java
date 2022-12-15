package Aleatorios;

public class ejercicioDados {
    /**
     *Escribe un programa que muestre la tirada de tres dados.
     *Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
     */
    public static void main(String[] args) {
        int dado1 = (int)Math.floor(Math.random()*(6-1+1)+1);
        int dado2 = (int)Math.floor(Math.random()*(6-1+1)+1);
        int dado3 = (int)Math.floor(Math.random()*(6-1+1)+1);
        System.out.println("Dado 1: " + dado1 +
                        "\nDado 2: "+ dado2 +
                        "\nDado 3: " + dado3);
        System.out.println("Suma de los tres dados: " + (dado1+dado2+dado3));
    }
}
