package Actividades;
/*
El programa pedirá al usuario que ingrese un número entero positivo.
Luego, el programa imprimirá todos los números desde 1 hasta el número ingresado,
indicando si cada número es par o impar. */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número entero positivo");
        int num1 = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= num1; i++){
            if (i % 2 != 0){
                System.out.println("El número "+i+" es impar");
            }else {
                System.out.println("El número "+i+" es par");
            }//fin del if
        }//fin del for
    }//fin de la clase main

}//fin de la clase Actividad02
