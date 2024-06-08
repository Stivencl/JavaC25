import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Clase12 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println("______________________________________");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("______________________________________");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println("-_______________________________________");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println("________________________________________");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(localTime.format(dateTimeFormatter));
        System.out.println("__________________________________________");
  //Hacer un programa que diga mi edad

        String fecha = "14/10/1990";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);

         LocalDate fechaActual =  LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        System.out.println(periodo.getYears());

    }
}
