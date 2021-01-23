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

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        //Criando HashTable
        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);
        System.out.println("");

        //Atualizando item
        estudantes.put("Pedro", 55);
        System.out.println(estudantes);
        System.out.println("");

        //Removendo um item pelo índice
        estudantes.remove("Pedro");
        System.out.println(estudantes);
        System.out.println("");

        //Vizualizando item pelo índice
        System.out.println(estudantes.get("Mariana"));
        System.out.println("");

        //Tamanho da HashTable
        System.out.println("HashTable possui " + estudantes.size() + " itens.");
        System.out.println("");

        //Navegando pelos índices do mapa
        Iterator<String> iterator = estudantes.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + estudantes.get(key) + " anos");
        }
        System.out.println("");

        for (String estudante : estudantes.keySet()){
            System.out.println(estudante + " -- " + estudantes.get(estudante) + " anos");
        }
        System.out.println("");

        for (Map.Entry<String, Integer> estudante : estudantes.entrySet()){
            System.out.println(estudante.getKey() + " --- " + estudante.getValue() + " anos");
        }

    }
}
