package CollectionQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
* java.util.LinkedList (Implementa interface queue e seus métodos)
* Garante ordem de inserção
* Permite adição, leitura e remoção considerando a regra básica de uma fila: Primeiro que entra, primeiro que sai.
* Não permite mudança de ordenação.
* */

public class ExemploQueue01 {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        //Criando a fila
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pâmela");
        filaBanco.add("Anderson");

        System.out.println("-> " + filaBanco);

        String clienteASeratendido = filaBanco.poll(); //remove primeiro elemento da fila
        System.out.println("--> " + clienteASeratendido);
        System.out.println("--> " + filaBanco);

        String primeiroCliente = filaBanco.peek(); //Retorna primeiro elemento da fila sem excuí-lo
        System.out.println("---> " + primeiroCliente);
        System.out.println("---> " + filaBanco);

        for (String cliente: filaBanco){
            System.out.println("----> " + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("-----> " + iteratorFilaBanco.next());
        }

        filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element(); //Retorna primeiro elemento da fila sem excuí-lo e retorna exceção quando Fila vazia
        System.out.println("------> " + primeiroClienteOuErro);
        System.out.println("------> " + filaBanco);

    }
}
