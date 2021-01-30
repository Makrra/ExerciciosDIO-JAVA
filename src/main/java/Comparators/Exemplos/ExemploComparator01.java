package Comparators.Exemplos;

/*
* Interfaces que aprenderemos:
* java.util.Comparator - Interface para definir classe com regra de ordenação
* java.util.Comparable - Interface para definir regra de ordenação em uma classe de domínio
*
* Comparators e Comparables são interfaces da api de collections para podermos trabalhar ordenação de coleções
*
* Algoritmos de ordenação
* Utilizado primariamente em java.util.list
* Permite a ordenação de objetos complexos
* */

import java.util.*;

public class ExemploComparator01 {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        //Criando Lista
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(estudantes);
        System.out.println("");

        System.out.println("--- Ordem Natural dos Números - Idades ---");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);
        System.out.println("");

        System.out.println("--- Ordem Reversa dos Números - Idades ---");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);
        System.out.println("");

        System.out.println("--- Ordem Natural dos Números - Idades (Method Reference) ---");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);
        System.out.println("");

        System.out.println("--- Ordem Reversa dos Números - Idades (Method Reference) ---");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);
        System.out.println("");

        System.out.println("--- Ordem Natural dos Números - Idades (Interface Comparator) ---");
        Collections.sort(estudantes);
        System.out.println(estudantes);
        System.out.println("");

        System.out.println("--- Ordem Reversa dos Números - Idades (Interface Comparator) ---");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println(estudantes);
        System.out.println("");
    }
}
