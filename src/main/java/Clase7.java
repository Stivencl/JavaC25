import java.util.Arrays;
import java.util.List;

public class Clase7 {
    public static void main(String[] args) {
        //accede a la funcion sumar por medio de un objeto
      Clase7 clase7 = new Clase7();
      clase7.sumar(3,5);

      //Se accedio a la funcion restar con el metodo Static
      restar(10,2);
      //Metodo Stream para manipular listas.

        List<Integer> numeros = Arrays.asList(1,55,20,100,5,7,9);
          //Ordena los numeros de menor a mayor
          numeros.sort(Integer::compare);
         numeros.stream().forEach(System.out::println);

         numeros.stream().filter(n-> n%2==0).forEach(System.out::println);
        System.out.println("Finaliza stream: números pares de la lista números");

        List<String> palabras = Arrays.asList("java","php","javascript","html","lamba");

         //Cambia las palabras a mayuscula
         palabras.stream().map(p->p.toUpperCase()).forEach(System.out::println);
        System.out.println("Stream convierte las palabras de la lista en mayus");

        //Solo selecciona las parabras que inician con l
        palabras.stream().filter(l-> l.startsWith("l")).forEach(System.out::println);
        System.out.println("Finaliza stream: solo selecciona las palabras que empienzan con L");

        //Solo selecciona las palbras que contengan la letra a
         palabras.stream().filter(p-> p.contains("a")).forEach(System.out::println);
        System.out.println("Stream con filtro contains: solo selecciona las palabras que contengan la letra a");
        
        System.out.println(palabras);
    }//fin de la clase main

  private int sumar(int num1, int num2){
        return num1+num2;
    }

    //Con el metodo static no hay que llamar la función por medio de un objeto
    //se utiliza cuando se debe estar consultando varias veces, cómo por ejemplo, la funcion LocalDate que permite consultar la hora actual

    private static int restar(int num1, int num2){
        return num1+num2;
    }
}
