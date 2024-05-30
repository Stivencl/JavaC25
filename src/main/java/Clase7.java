import java.util.Arrays;
import java.util.List;

public class Clase7 {
    public static void main(String[] args) {
      Clase7 clase7 = new Clase7();
      clase7.sumar(3,5);
      //Se accedio a la funcion restar con el metodo Static
      restar(10,2);

        List<Integer> numeros = Arrays.asList(1,55,20,100,5,7,9);
          //Ordena los numeros de menor a mayor
          numeros.sort(Integer::compare);
         numeros.stream().forEach(System.out::println);

         numeros.stream().filter(n-> n%2==0).forEach(System.out::println);

        List<String> palabras = Arrays.asList("java","php","javascript","html","lamba");
         //Cambia las palabras a mayuscula
         palabras.stream().map(p->p.toUpperCase()).forEach(System.out::println);
        //Solo selecciona las parabras que inician con l
        palabras.stream().filter(l-> l.startsWith("l")).forEach(System.out::println);

    }//fin de la clase main

  private int sumar(int num1, int num2){
        return num1+num2;
    }

    //Con el metodo static no hay que llamar la función por medio de un objeto
    //se utiliza cuando se debe estar consultando como por ejemplo la funcion LocalDate que permte consultar la hora

    private static int restar(int num1, int num2){
        return num1+num2;
    }
}
