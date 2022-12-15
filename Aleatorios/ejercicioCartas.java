package Aleatorios;

public class ejercicioCartas {
    /**
     * Programa que muestre al azar el nombre de una carta de la baraja francesa.
     * Está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
     * Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales:
     * 2,3,4,5,6,7 y 8,9,10,J,Q,K,A(1).
     */
    public static void main(String[] args) {
        int palo = (int)Math.floor(Math.random()*(4)+1);
        String nombrePalo = switch (palo) {
            case 1 -> "Corazones";
            case 2 -> "Diamantes";
            case 3 -> "Picas";
            case 4 -> "Tréboles";
            default -> String.valueOf(palo);
        };

        int carta = (int)Math.floor(Math.random()*(13)+1);
        String cartaString = switch (carta) {
            /*
             * case 2 -> "2";
             * case 3 -> "3";
             * case 4 -> "4";
             * case 5 -> "5";
             * case 6 -> "6";
             * case 7 -> "7";
             * case 8 -> "8";
             * case 9 -> "9";
             * case 10 -> "10";
             */
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(carta);
        };
        System.out.println("Carta: " + cartaString + " de " + nombrePalo);
    }
}
