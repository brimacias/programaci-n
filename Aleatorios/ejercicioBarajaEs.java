package Aleatorios;

public class ejercicioBarajaEs {
    public static void main(String[] args) {
        int palo = (int)Math.floor(Math.random()*(4-1+1)+1);
        String nombrePalo = switch (palo) {
            case 1 -> "Espadas";
            case 2 -> "Copas";
            case 3 -> "Picas";
            case 4 -> "Tréboles";
            default -> String.valueOf(palo);
        };

        int carta = (int)Math.floor(Math.random()*(12-1+1)+1);
        String cartaString = switch (carta) {
            case 1 -> "as";
            case 10 -> "sota";
            case 11 -> "caballo";
            case 12 -> "rey";
            default -> String.valueOf(carta);
        };
        System.out.println("Carta: " + cartaString + " de " + nombrePalo);
    }
}
