import java.util.Scanner;

public class Clase02 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor en pesos para convertir en dolar");

        double peso = scanner.nextDouble();
        System.out.println("EL valor en dolares es " +peso/4000);

        scanner.close();
    }
}
