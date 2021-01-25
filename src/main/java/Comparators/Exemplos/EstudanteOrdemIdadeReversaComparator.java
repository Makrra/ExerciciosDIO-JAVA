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

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante o1, Estudante o2){
        return o2.getIdade() - o1.getIdade();
    }
}
