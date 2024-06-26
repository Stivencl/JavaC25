package EjerciciosPractica;

import java.util.Scanner;

public class CadenaAlreves {
    public static void main(String[] args) {

        String cadena;
        String nCadena = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita la cadena de texto");
        cadena = scanner.nextLine();
        scanner.close();
        for (int i = cadena.length()-1; i>=0; i--){

            nCadena = nCadena + cadena.charAt(i);


        }

        System.out.println(nCadena);

    }
}
