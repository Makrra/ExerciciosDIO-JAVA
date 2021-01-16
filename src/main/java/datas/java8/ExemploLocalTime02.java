package datas.java8;

import java.time.LocalTime;

public class ExemploLocalTime02 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime umaHoraAtras = agora.minusHours(1);
        System.out.println(umaHoraAtras);
    }
}
