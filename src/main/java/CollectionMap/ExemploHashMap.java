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

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        //Adicionando campeões mundiais Fifa no Mapa
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println("-> " + campeoesMundiaisFifa);
        System.out.println("");

        //Atualizando valor do mapa
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println("--> " + campeoesMundiaisFifa);
        System.out.println("");

        //Retornado títulos da Argentina
        System.out.println("---> " + campeoesMundiaisFifa.get("Argentina"));
        System.out.println("");

        //Retornando se existe ou não um campeão França
        System.out.println("----> " + campeoesMundiaisFifa.containsKey("França"));
        System.out.println("");

        //Remove o campeão França
        campeoesMundiaisFifa.remove("França");
        System.out.println("-----> " + campeoesMundiaisFifa);
        System.out.println("");

        //Retornando se existe ou não um campeão França
        System.out.println("------> " + campeoesMundiaisFifa.containsKey("França"));
        System.out.println("");

        //Retornando se existe ou não uma seleção Hexacampeã
        System.out.println("-------> " + campeoesMundiaisFifa.containsValue(6));
        System.out.println("");

        //Retorna o tamanho do Mapa
        System.out.println("--------> O mapa tem " + campeoesMundiaisFifa.size() + " elementos");
        System.out.println("");

//        //Navegar nos Registros do Mapa (1)
//        for (Map.Entry<String, Integer> entry: campeoesMundiaisFifa.entrySet()){
//            System.out.println("---------> " + entry.getKey() + " == " + entry.getValue());
//        }

        //Navegar nos Registros do Mapa (2)
        for (String key : campeoesMundiaisFifa.keySet()){
            System.out.println("---------> " + key + " == " + campeoesMundiaisFifa.get(key));
        }
        System.out.println("");

        //Verifica se o Mapa possui o país Estados Unidos
        System.out.println("----------> " + campeoesMundiaisFifa.containsKey("Estados Unidos"));
        System.out.println("");

        //Verifica se o Mapa possui o valor 5
        System.out.println("----------> " + campeoesMundiaisFifa.containsValue(5));
        System.out.println("");

        //Verifica o tamanho antes e depois de limpar o Mapa
        System.out.println("--------> O mapa tem " + campeoesMundiaisFifa.size() + " elementos");
        campeoesMundiaisFifa.clear();
        System.out.println("--------> O mapa tem " + campeoesMundiaisFifa.size() + " elementos");
    }
}
