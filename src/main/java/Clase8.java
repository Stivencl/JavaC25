import java.util.List;

public class Clase8 {
    public static void main(String[] args) {
        //loop FOR
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        //Foreach utilizado para recorrer estructuras
        int [] numeros = {1,2,3,4,5};
        for( int numero:numeros){
            System.out.println(numero);
        }


        //Loop Do while
        int i = 1;
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i <= 5);

        //Loop While
        i = 1;
        while (i <= 5) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        //Loop con stream
        List<String> comidas = List.of("arroz","Suchi","Pasta");
        comidas.stream().forEach(System.out::println);
        comidas.forEach(System.out::println);
    } //fin de la clase main


}//fin de la clase clase8


