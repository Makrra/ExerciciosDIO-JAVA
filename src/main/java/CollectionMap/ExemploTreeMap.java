package CollectionMap;

/*
 * java.util.HashMap
 * java.util.TreeMap - Não preocupado com performance e sim com a ordenação
 * java.util.HashTable - Compartilhado entre várias threads, pode ser acessado por muitas ao mesmo tempo
 *
 * Não é uma interface que extend de java.util.collection
 * Entrada de chave e valor
 * Permite valores repetidos, mas não permite repetição de chave
 * Permite adição, busca por chave ou valor, atualização, remoção e navegação
 * Pode ser ordenado
 * */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Criando a árvore com capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        treeCapitais.put("RN", "Natal");
        treeCapitais.put("CE", "Fortaleza");

        System.out.println("-> " + treeCapitais);
        System.out.println("");

        //Retorna a primeira capital no topo da árvore
        System.out.println("--> " + treeCapitais.firstKey());
        System.out.println("");

        //Retorna a última capital no final da árvore
        System.out.println("---> " + treeCapitais.lastKey());
        System.out.println("");

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println("----> " + treeCapitais.lowerKey("SC"));
        System.out.println("");

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println("----> " + treeCapitais.higherKey("SC"));
        System.out.println("");

        //Retorna a primeira capital no topo da árvore
        System.out.println("-----> " + treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());
        System.out.println("");

        //Retorna a última capital no final da árvore
        System.out.println("------> " + treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());
        System.out.println("");

        //Retorna e remove a primeira capital do topo da árvore
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println("-------> " + firstEntry.getKey() + " - " + firstEntry.getValue());
        System.out.println("-------> " + lastEntry.getKey() + " - " + lastEntry.getValue());
        System.out.println("");

        //Navegando por todas as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println("--------> " + key + " - " + treeCapitais.get(key)); //Busca através do Get
//        }
//        System.out.println("");

//        for (String capital : treeCapitais.keySet()){
//            System.out.println("---------> " + capital + " - " + treeCapitais.get(capital)); //Busca pelo Get mas via keySet
//        }
//        System.out.println("");

        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println("---------> " + capital.getKey() + " - " + capital.getValue()); //Busca direto pela chave a valor da chave peo entrySet
        }
        System.out.println("");
    }
}
