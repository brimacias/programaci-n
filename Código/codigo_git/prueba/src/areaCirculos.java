import java.util.Scanner;

public class areaCirculos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);;
        double radio;
        do {
            System.out.println("Introducir el radio de la circunferencia: ");
            radio = teclado.nextDouble();
            double area = Math.PI * Math.pow(radio,2);
            System.out.println("El área de la circunferencia es " + area);
        } while (radio != 0);
    }
}
