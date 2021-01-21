package CollectionList;

import java.util.*;

public class ExemploList01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Larissa");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Carlos");
        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        //Tipos de Iterações
        int posicao = nomes.indexOf("Pedro");
        System.out.println(nomes);
        System.out.println(posicao);

        for (String nomeDoItem: nomes){
            System.out.println("---> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator(); //Retorna Iterator de String, onde pode ser navegado pelo while
        while (iterator.hasNext()){                   // O hasNext retorna booleano true sempre que existir mais um elemento da lista
            System.out.println("-----> " + iterator.next()); //O next Retorna o objeto que estamos entrando no momento
        }


        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);
        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);


    }
}
