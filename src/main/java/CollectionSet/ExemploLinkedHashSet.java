package CollectionSet;

/*
 * java.util.HashSet - É utilizado quando não necessário manter uma ordenação
 *                   - Não é ordenado e não permite valores repetidos
 *                   - Por não ter repetição de valores e não ser ordenado, é a implementação mais performática
 * java.util.LinkedHashSet - É utilizado quando é necessário manter a ordem de inserção dos elementos
 *                         - Mantém a ordem de inserção dos elementos
 *                         - É a implementação mais lenta por ser necessário manter a ordem
 * java.util.TreeSet - É utilizado quando é necessário alterar a ordem através do uso de comparators
 *                   - Mantém ordem e pode ser reordenado
 *                   - É performático para leitura. Para modificação tem a necessidde de reordenar, sendo mais lento que o LinkedHashSet
 *
 * Por padrão não garantem ordem
 * Não permite itens repetidos
 * Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação
 * Não permite mudança de ordenação
 * */

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona sequência numérica
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println("-> " + sequenciaNumerica);
        System.out.println("");

        //Removendo número do Set
        sequenciaNumerica.remove(4);
        System.out.println("--> " + sequenciaNumerica);
        System.out.println("");

        //Retornando quantidade de itens do Set
        System.out.println("---> Existem " + sequenciaNumerica.size() + " itens no Set");
        System.out.println("");

        //Navegando pelo Set
        for (Integer numero: sequenciaNumerica){
            System.out.println("----> " + numero);
        }
        System.out.println("");

        //Verifica se Set vazio
//        sequenciaNumerica.clear();
        System.out.println("----> Set vazio? " + sequenciaNumerica.isEmpty());
    }
}
