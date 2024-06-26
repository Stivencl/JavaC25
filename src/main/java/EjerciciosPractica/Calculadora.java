package EjerciciosPractica;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dos números");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println("seleccione 1: suma 2: Resta 3: Multiplicación 4: Division");
        int op = scanner.nextInt();
        scanner.close();
        switch (op){

            case 1:
                System.out.println("El resultado de la suma es.. "+(n1+n2));
                break;
            case 2:
                System.out.println("El resultado de la resta es.. "+(n1-n2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es.. "+(n1*n2));
                break;
            case 4:
                if (n1 == 0 || n2 == 0){
                    System.out.println("La división por cero no es posible");
                    break;
                }else {
                    System.out.println("El resultado de la división es.. "+(n1/n2));
                    break;
                }

            default:
                System.out.println("El número no es valido");
                break;
        }

    }


}
