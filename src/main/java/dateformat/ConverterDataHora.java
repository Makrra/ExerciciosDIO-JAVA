package dateformat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ConverterDataHora {
    public static void main(String[] args) {
        Date dataHoje = new Date();
        System.out.println(dataHoje);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy HH:mm:ss:SSS");
        System.out.println(formatter.format(dataHoje));
    }
}
