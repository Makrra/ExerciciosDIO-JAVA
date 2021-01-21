package CollectionList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExercicioPropostoList01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        //Criação da Lista
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegando na lista
        for (String nome: nomes){
            System.out.println("-> " + nome);
        }

        //Substituindo o nome Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println("--> " + nomes);

        //Retornando o nome da posição 1
        System.out.println("---> " + nomes.get(0));

        //Remover o nome da posição 4
        nomes.remove(3);

        //Remover o nome João
        nomes.remove("João");
        System.out.println("----> " + nomes);

        //Retornar a quantidade de itens da lista
        System.out.println("-----> Existem " + nomes.size() + " itens na lista");

        //Verificar se existe nome Juliana na lista
        System.out.println("------> " + nomes.contains("Juliana"));

//        //Apagando Lista
//        nomes.clear();
//        System.out.println("-------> " + nomes);

        //Criando Nova Lista
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        for (String nome2: nomes2){
            System.out.println("-> " + nome2);
        }

        //Adicionando todos os nomes da nova lista na primeira lista
        nomes.addAll(nomes2);
        System.out.println("-------> " + nomes);

        //Ordenar Lista
        Collections.sort(nomes);
        for (String nome: nomes){
            System.out.println("--------> " + nome);
        }

        //Verificando se Lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println("---------> " + listaVazia);
        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println("---------> " + listaVazia);


    }
}
