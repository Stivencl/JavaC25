import java.util.Scanner;

public class Clase04 {

    public static void main(String[] args){

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite el nombre completo");
        String nombre = scanner.next();
     //   System.out.println("Digite genero F:femenino, M:maculino, o:otro ");
//        char genero = (char) scanner.next();
        scanner.close();

        Persona persona = new Persona(nombre, 'F');
        System.out.println("el genero de "+persona.getNombreCompleto()+" es: "+persona.getGenero());
    }
}
