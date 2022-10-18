import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introducir tres números: ");
        String a = br.readLine();
        int num1 = Integer.parseInt(a);
        String b = br.readLine();
        int num2 = Integer.parseInt(b);
        String c = br.readLine();
        int num3 = Integer.parseInt(c);
        if (num1 == num2 || num2 == num3) {
            System.out.println("No se puede ejecutar porque hay números iguales.");
        }
        else if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1 + ".");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es " + num2 + ".");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El mayor es " + num3 + ".");
        }
    }
}
