package manipulando.datas;

import java.util.Date;

public class DescubrirTimeInMillis {

    public static void main(String[] args) {
        //Criando objetos Date
        Date dataNascimento = new Date(91, 6, 9, 9, 30);
        Date dataComparada = new Date(110,4, 15);
        Date dataAtual = new Date(1610321300240l);

        //Imprimindo datas de nascimento e comparada e descobrindo epoch
        System.out.println(dataNascimento);
        System.out.println(dataNascimento.getTime()); //679062600000

        System.out.println(dataComparada);
        System.out.println(dataComparada.getTime()); //1273892400000

        //Comparando as datas
        System.out.println(dataNascimento.after(dataComparada)); // false
        System.out.println(dataNascimento.before(dataComparada)); // true

        //Data atual em milisegundos
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        System.out.println(dataAtual);

    }

}
