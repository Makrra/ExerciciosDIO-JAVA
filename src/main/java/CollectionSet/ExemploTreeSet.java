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

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Montando a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println("-> " + treeCapitais);
        System.out.println("");

        //Retorna a primeira capital do topo da árvore
        System.out.println("--> " + treeCapitais.first());
        System.out.println("");

        //Retorna a última capital do final da árvore
        System.out.println("---> " + treeCapitais.last());
        System.out.println("");

        //Retorna a primeira capital abaixo na árvore da capital parametizada
        System.out.println("----> " + treeCapitais.lower("Florianópolis"));
        System.out.println("");

        //Retorna a primeira capital acima na árvore da capital parametizada
        System.out.println("-----> " + treeCapitais.higher("Florianópolis"));
        System.out.println("");

        //Exibir todas as capitas no console
        System.out.println("------> " + treeCapitais);
        System.out.println("");

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println("-------> " + treeCapitais.pollFirst());
        System.out.println("");

        //Retorna a primeiracapital do final da árvore, removendo do set
        System.out.println("--------> " + treeCapitais.pollLast());
        System.out.println("");

        //Exibir todas as capitas no console
        System.out.println("---------> " + treeCapitais);
        System.out.println("");

        //Navegando por todos os itens de iterator
        Iterator<String> iteratorTreeCapitais = treeCapitais.iterator();
        while (iteratorTreeCapitais.hasNext()){
            System.out.println("----------> " + iteratorTreeCapitais.next());
        }
        System.out.println("");

    }
}
