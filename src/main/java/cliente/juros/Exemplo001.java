package cliente.juros;

import java.util.Calendar;

public class Exemplo001 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é : " + agora.getTime());
        System.out.print("\n");

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás : " + agora.getTime());
        System.out.printf("%tF\n", agora);
        System.out.print("\n");

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois : " + agora.getTime());
        System.out.printf("%tD\n", agora);
        System.out.print("\n");

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois : " + agora.getTime());
        System.out.printf("%tD\n", agora);
        System.out.print("\n");

        agora.add(Calendar.HOUR, 4);
        System.out.println("4 horas depois : " + agora.getTime());
        System.out.printf("%tr\n", agora);
        System.out.printf("%tT\n", agora);
        System.out.print("\n");

    }
}
