import java.util.ArrayList;
import java.util.List;

public class Clase06 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] valores = {1,2,3};

        Persona[] personas = new Persona[2];

        personas[0] = new Persona("Stiven", 'M');
        personas[1] = new Persona("Pepe", 'M');

        List<Persona> personaList = new ArrayList<>();
        List<String> mercado = List.of("Azucar", "papa");
    }
}
