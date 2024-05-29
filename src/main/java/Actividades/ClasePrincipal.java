package Actividades;
/*
deben crear una clase. de un objeto que tengan a su alrededor y que tenga minimo 4 atributos y 2 funciones.
notas....
deben tener sus constructores y sus metodos privados y lo deben llamar desde un main.
*/


import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la marca del Tv");
        String marca1 = scanner.next();
        System.out.println("Digite la tecnologia de la pantalla");
        String pantalla = scanner.next();
        scanner.close();

        Tv tv = new Tv(marca1,pantalla);
        System.out.println("Marca del TV seleccionado "+tv.getMarca()+" tipo de pantalla "+tv.getPantalla()+"\n Gracias por su compra");
    }
}
