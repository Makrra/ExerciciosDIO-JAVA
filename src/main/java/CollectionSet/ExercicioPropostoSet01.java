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

import java.util.Collection;
import java.util.HashSet;

public class ExercicioPropostoSet01 {
    public static void main(String[] args) {
        HashSet<Integer> numerosInteiros = new HashSet<>();

        //Criando Set
        numerosInteiros.add(3);
        numerosInteiros.add(8);
        numerosInteiros.add(20);
        numerosInteiros.add(44);
        numerosInteiros.add(3);

        //Navegando no Set
        for (Integer numero: numerosInteiros){
            System.out.println("-> " + numero);
        }
        System.out.println("");

        //Adicionando um novo número
        numerosInteiros.add(23);
        System.out.println("--> " + numerosInteiros);
        System.out.println("");

        //Verificando o tamanho do Set
        System.out.println("---> Existem " + numerosInteiros.size() + " itens no Set");
        System.out.println("");

        //Verificando se o Set está vazio
//        numerosInteiros.clear();
        System.out.println("----> O Set está vazio? " + numerosInteiros.isEmpty());


    }
}
