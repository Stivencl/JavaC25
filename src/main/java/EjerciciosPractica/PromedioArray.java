package EjerciciosPractica;

public class PromedioArray {
    public static void main(String[] args) {
        int[] promedio = {1,2,3,4,5,6,7,8,9};
        int suma = 0;
        int res;
        for (int i = 0; i < promedio.length; i++ ){
             suma += promedio[i];

        }//end for
          res = suma/promedio.length;
        System.out.println("El promedio del array es.. "+res);
    }//end main
}//end class
