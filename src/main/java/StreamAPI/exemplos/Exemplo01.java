package StreamAPI.exemplos;

/*
* Manipulação de coleções com o paradigma funcional de forma paralela
* Imutável - Não altera a coleção origem, sempre cria uma nova coleção
*
* Principais funcionalidade:
* > Mapping - Retorna uma coleção com mesmo tamanho da origem com os elementos alterados
* > Filtering - Retorna uma coleção igual ou menor que a coleção origem, com os elementos intactos
* > ForEach - executa uma determinada lógica para cada elemento, retornando nada
* > Peek - Executa uma determinada lógica para cada elemento, retornando a própria coleção
* > Counting - Retorna um inteiro que representa a contagem de elementos
* > Grouping - Retorna uma coleção agrupada de acordo com a regra definida
* */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo01 {
    public static void main(String[] args) {
        //Criando coleção
        List<String> estudante = new ArrayList<>();

        //Adicionando Estudantes
        estudante.add("Pedro");
        estudante.add("Thayse");
        estudante.add("Marcelo");
        estudante.add("Carla");
        estudante.add("Juliana");
        estudante.add("Thiago");
        estudante.add("Rafael");

        //Retornando contagem de elementos do Stream
        System.out.println("Contagem: " + estudante.stream().count());
        System.out.println("");

        //Retornando elemento com maior número de letras
        System.out.println("Estudante com maior número de letras: " + estudante.stream().max(Comparator.comparingInt(String::length)));

        //Retornando elemento com menor número de letras
        System.out.println("Estudante com menor número de letras: " + estudante.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("");

        //Retornando nomes com a letra r
        System.out.println("Nomes com letra r: " + estudante.stream().filter((estudantes) ->
                estudantes.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retornando uma nova coleção com os nomes concatenados a quantidade de letras de cada item
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudante.stream().map((estudantes) ->
                estudantes.concat(" - ").concat(String.valueOf(estudantes.length()))).collect(Collectors.toList()));

        //Retornando apenas os 3 elementos da coleção
        System.out.println("");
        System.out.println("3 primeiros elementos: " + estudante.stream().limit(3).collect(Collectors.toList()));

        //Exibindo elementos no console
        System.out.println("");
        System.out.println("Retornando elementos: " + estudante.stream().peek((System.out::println)).collect(Collectors.toList()));
        //Exibindo elemento sem retornar outra coleção
        System.out.println("");
        System.out.println("Retornando elementos: ");
        estudante.stream().forEach(System.out::println);

        //Retornando True se todos os elementos possuírem a letra W no nome
        System.out.println("");
        System.out.println("Todos os elementos possuem W no nome? " + estudante.stream().allMatch((elemento) -> elemento.contains("W")));

        //Retornando True se algum dos elementos possue a letra a minúcula no nome
        System.out.println("Tem algum elemento com a letra a minúscula no nome? " + estudante.stream().anyMatch((elemento) -> elemento.contains("a")));

        //Retornando True se nenhum elemento possuir a letra a minúscula no nome
        System.out.println("Não tem nenhum elemento com a minúsculo no nome? " + estudante.stream().noneMatch((elemento) -> elemento.contains("a")));

        //Retornando o primeiro elemento da coleção se existir exibe no console
        System.out.println("");
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudante.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação em cadeia
        System.out.println("");
        System.out.println("Operação em cadeia: ");
        System.out.println(
                estudante.stream()
                    .peek(System.out::println)
                    .map(estudantes -> estudantes.concat(" - ".concat(String.valueOf(estudantes.length()))))
                    .peek(System.out::println)
                    .filter((estudantes) -> estudantes.toLowerCase().contains("a"))
//                    .collect(Collectors.toList())
//                    .collect(Collectors.joining(", "))
//                    .collect(Collectors.toSet())
                    .collect(Collectors.groupingBy(estudantes -> estudantes.substring(estudantes.indexOf("-") + 1)))
        );

    }
}
