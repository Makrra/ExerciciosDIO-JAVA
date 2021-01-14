package cliente.juros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class PagamentoCliente {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in); // Parâmetro para Inputs
        Calendar dataRecebidaFormatadaCalendar = Calendar.getInstance(); // Instancia o Calendar
        SimpleDateFormat formatoDMY = new SimpleDateFormat("dd/MM/yyyy"); // Formatar Entrada de Data
        SimpleDateFormat formatoW = new SimpleDateFormat("EEEE");

        // Recebe uma data no padrão dd/MM/yyyy e converte de String para Date
        System.out.println("Informe a data de vencimento: ");
        String dataRecebidaString = sc.nextLine();
        Date dataRecebidaFormatadaDate = formatoDMY.parse(dataRecebidaString);

        // Converte para Calendar
        dataRecebidaFormatadaCalendar.setTime(dataRecebidaFormatadaDate);

        // Adiciona 10 dias na Data Informada
//        dataRecebidaFormatadaCalendar.add(Calendar.DATE, 10);

        // Verifica se o dia cai no sábado ou domingo e segue para a segunda-feira
        if(formatoW.format(dataRecebidaFormatadaCalendar.getTime()).equals("quarta-feira")){
            dataRecebidaFormatadaCalendar.add(Calendar.DATE, 12);
        } else if(formatoW.format(dataRecebidaFormatadaCalendar.getTime()).equals("quinta-feira")){
            dataRecebidaFormatadaCalendar.add(Calendar.DATE, 11);
        } else {
            dataRecebidaFormatadaCalendar.add(Calendar.DATE, 10);
        }

        System.out.println("Você terá até o dia " + formatoDMY.format(dataRecebidaFormatadaCalendar.getTime()) + " para pagar sem juros.");
//        System.out.println(formatoW.format(dataRecebidaFormatadaCalendar.getTime()));

    }
}
