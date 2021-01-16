package datas.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class AdicionarTempo {
    public static void main(String[] args) {
        LocalDateTime diaDeHoje = LocalDateTime.now();
        System.out.println(diaDeHoje);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatter.format(diaDeHoje));

        LocalDateTime diaAntes = LocalDateTime.parse("15/05/2010 10:00:00", formatter);
        System.out.println(formatter.format(diaAntes));

        LocalDateTime diaApos = diaAntes.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(formatter.format(diaApos));
    }
}
