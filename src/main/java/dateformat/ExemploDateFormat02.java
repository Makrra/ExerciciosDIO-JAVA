package dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDateFormat02 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
