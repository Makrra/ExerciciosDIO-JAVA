package StreamAPI.exerciciospropostos;

/*
 * 1 - Utilizando uma lista com um objeto complexo realize as seguintes operações:
 * > Transforme cada aluno em uma String com os atributos do objeto
 * > Conte a quantidade de alunos tem na coleção
 * > Filtre os alunos com a idade igual ou superior a 18 anos
 * > Retorne alunos com nome que possui a letra B
 * > Retorne se existe ao menos um aluno com a letra D no nome
 * > Retorne o aluno mais velho da coleção. Retornar o mais novo também
 * */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ControleAlunos {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        //Verificando qual o tipo do objeto
//        System.out.println(aluno.getClass());

        //Criando elementos da Collection
        alunos.add(new Aluno("João", 8));
        alunos.add(new Aluno("Maria", 17));
        alunos.add(new Aluno("Bárbara", 15));
        alunos.add(new Aluno("Neydson", 7));
        alunos.add(new Aluno("Raquely", 33));
        alunos.add(new Aluno("Gabriel", 66));
        alunos.add(new Aluno("Ivoneide", 50));
        alunos.add(new Aluno("Nerivan", 54));
        alunos.add(new Aluno("Juvenal", 31));
        alunos.add(new Aluno("Raianny", 37));

        //Transformado cada aluno em uma String
        String alunoString = String.valueOf(alunos);

        //Verificando qual o tipo do objeto
//        System.out.println(alunoString.getClass());

        //Imprimindo Alunos
        System.out.println(alunos);

        //Retornando quantidade de elementos
        System.out.println("");
        System.out.println("Existem " + alunos.stream().count() + " elementos na lista");

        //Retornando alunos com idade igual ou maior a 18 anos
        System.out.println("");
        System.out.println("Os alunos maiores de idade são: " + alunos.stream().filter((alunoOther) ->
                alunoOther.getIdade() >= 18).collect(Collectors.toList())
        );

        //Retornando alunos com nome que possui a letra B
        System.out.println("");
        System.out.println("Os alunos com a letra B no nome são: " + alunos.stream().filter(
                (alunoOther) -> alunoOther.getNome().toUpperCase().contains("B")).collect(Collectors.toList())
        );

        //Retornando se existe alunos que possuem a letra D no nome
        System.out.println("");
        System.out.println("Existe alunos com a letra D no nome? " + alunos.stream().noneMatch(
                alunoOther -> alunoOther.getNome().toUpperCase().contains("D")
        ));

        //Retornando o aluno mais velho
        System.out.println("");
        System.out.println("O(A) aluno(a) mais velho(a) é: " + alunos.stream().max(
                Comparator.comparingInt(alunoOther -> alunoOther.getIdade())
        ));

        //Retornando o aluno mais novo
        System.out.println("");
        System.out.println("O(A) aluno(a) mais novo(a) é: " + alunos.stream().min(
                Comparator.comparingInt(alunoOther -> alunoOther.getIdade())
        ));


    }
}
