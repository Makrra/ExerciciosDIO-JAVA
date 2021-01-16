package datas.java8;

import java.time.LocalDate;

public class ExemploLocalDate02 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
    }
}
