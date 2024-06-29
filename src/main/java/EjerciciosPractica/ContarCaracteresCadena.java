package EjerciciosPractica;

import java.util.Scanner;

public class ContarCaracteresCadena {
    public static void main(String[] args) {
        String cadena;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase");
        cadena = scanner.nextLine();
         cadena = cadena.toLowerCase();
         cadena = cadena.replace(" ","");

         for(int i = 0; i <= cadena.length()-1;i++){
             for (int x = 0; x <= cadena.length()-1; x++){
                 if (cadena.charAt(i) == cadena.charAt(x)) {
                     contador = contador+1;
                 }//end if

             }//end for son
             System.out.println("la letra "+cadena.charAt(i)+" se repite "+contador);
             contador = 0;
         }//end for father

    }
}
