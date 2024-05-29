public class clase05 {
    public static void main(String[] args) {
        int edad = 30;
        if (edad>17){
            System.out.println("es mayor de edad");

        }else{
            System.out.println("Es menor de edad");
        }

        int dsemana = 2;
        switch (dsemana){
            case 1:
                System.out.printf("Lunes");
            case 2:
                System.out.printf("Martes");
            case 3:
                System.out.printf("Miercoles");
            default:
                System.out.println("Dia no valido");
        }
    }
}
