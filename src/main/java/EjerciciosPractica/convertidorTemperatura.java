package EjerciciosPractica;

import java.util.Scanner;

public class convertidorTemperatura {
    public static void main(String[] args) {
        int menu;
        double grados;
        double gradosCelsius;
        double gradosCelAfah;
        double gradosfahrenheit;
        double gradosafhrACels;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la opcion 1: celsius a fahrenheit 2:fahrenheit a celsius ");
        menu = scanner.nextInt();

        if (menu == 1) {
            System.out.println("Digita los grados celsius");
            gradosCelsius = scanner.nextDouble();
            gradosCelAfah = ((gradosCelsius * 1.8)+32);
            System.out.println(gradosCelsius+" es igual a "+gradosCelAfah+" Fahrenheit");
        }else if (menu == 2){
            System.out.println("Digita los grados fahrenheit");
            gradosfahrenheit = scanner.nextDouble();
            gradosafhrACels = ((gradosfahrenheit - 32) * 0.5556);
            System.out.println(gradosfahrenheit+" es igual a "+gradosafhrACels+" Fahrenheit");
        }else {
            System.out.println("La opción digitada no es valida");
        }//end else
        scanner.close();
    }//end main
}//end class
