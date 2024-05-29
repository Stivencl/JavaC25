public class Mutabilidadinmuta {

    public static void main(String[] args) {
       //Ejemplo de inmutablidad String
        String x = "Hola";
        String y = "Hola";

        System.out.println("x: "+x);
        x = "Mundo";
        System.out.println("x: "+x);
        System.out.println("y: "+y);

      //Ejemplo de mutablidad Stringbuilder

        StringBuilder w = new StringBuilder("Hola");
        StringBuilder z = w;

        z.append("Mundo");

        System.out.println("w: "+w);

    }
}
