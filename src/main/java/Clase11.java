import java.util.ArrayList;
import java.util.List;

public class Clase11 {
    public static void main(String[] args) {
        List<Integer>  numeros = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> listanumeros = numeros.stream().filter(a-> a % 2 == 0).toList();
        listanumeros.forEach(System.out::println);

        int count = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(count);
    }
}
