package Actividades;

/*
 Escribe un programa que verifique si una cadena de texto es un palíndromo.
Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual de adelante hacia atrás
y de atrás hacia adelante (ignorando espacios, puntuación y mayúsculas).
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la palabra o frase deseada señor usuario:");
        String palabra =  scanner.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ","");
        char[] caracterArray = palabra.toCharArray();

        int izq = 0;
        int der = caracterArray.length-1;

        for (int i = izq; i < der; i++){

            if (caracterArray[izq] == caracterArray[der]){
                der --;
                izq++;

            }else {
                System.out.println("La paralbra o frase digitada no es un palindromo");
                break;
            }
        }
       if (izq == der){
            System.out.println("La palabra o frase digitada es un palindromo");
        }
        scanner.close();


    }//fin del metodo main
}//finde la clase actividad03
