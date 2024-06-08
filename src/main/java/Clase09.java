public class Clase09 {
    public static void main(String[] args) {

         try {
             int a = 10;
             int b = 0;
             String c = null;
             c.length();
             System.out.println(a/b);
         }catch (ArithmeticException e) {
             System.out.println(e);
             System.out.println("Error: division por cero no es valida");

         }catch (NullPointerException exp){
             System.out.println(exp);
             System.out.println("Error: no se aceptan valores nulos");
         }finally {
             //finally simpre se ejecuta así hallan errores en el codigo
             System.out.println("Vuelve a ejecutar el secript");
         }
        System.out.println("Esto es un aprueba");
    }
}
