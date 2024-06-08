package Actividades;

/*
 Escribe un programa que verifique si una cadena de texto es un palíndromo.
Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual de adelante hacia atrás
y de atrás hacia adelante (ignorando espacios, puntuación y mayúsculas).
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Actividad03 {
    public static void main(String[] args) {

        String palabra = "arenera";
        ArrayList<Character> list = new ArrayList<Character>();
        char[] caracterArray = palabra.toCharArray();
        for (char a : caracterArray)
            list.add(a);

        


    }//fin del metodo main
}//finde la clase actividad03
