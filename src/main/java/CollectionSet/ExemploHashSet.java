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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adicionando notas no Set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println("-> " + notasAlunos);
        System.out.println("");

        //Removendo nota do set
        notasAlunos.remove(3.8);
        System.out.println("--> " + notasAlunos);
        System.out.println("");

        //Retorna quantidade de itens no Set
        System.out.println("---> Existem " + notasAlunos.size() + " itens no Set");
        System.out.println("");

        //Navega por todos os itens por iterator
        Iterator<Double> iteratorNotasAlunos = notasAlunos.iterator();
        while (iteratorNotasAlunos.hasNext()){
            System.out.println("----> " + iteratorNotasAlunos.next());
        }
        System.out.println("");

        //Retorna se o Set está vazio ou não
//        notasAlunos.clear();
        System.out.println("-----> Set vazio? " + notasAlunos.isEmpty());
    }
}
