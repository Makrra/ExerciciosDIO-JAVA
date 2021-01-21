package CollectionQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercícioQueue01 {
    public static void main(String[] args) {
        Queue<String> filaAtendimento = new LinkedList<>();

        //Criando Fila
        filaAtendimento.add("Juliana");
        filaAtendimento.add("Pedro");
        filaAtendimento.add("Carlos");
        filaAtendimento.add("Larissa");
        filaAtendimento.add("João");

        //Navegando na Lista
        Iterator<String> iteratorFilaAtendimento = filaAtendimento.iterator();
        while (iteratorFilaAtendimento.hasNext()){
            System.out.println("-> " + iteratorFilaAtendimento.next());
        }
        System.out.println("");

        //Retornar primeiro elemento da fila sem removê-lo
        System.out.println("--> " + filaAtendimento.peek());
        System.out.println("--> " + filaAtendimento);
        System.out.println("");

        //Retornar primeiro elemento da fila removendo-o
        System.out.println("---> " + filaAtendimento.poll());
        System.out.println("---> " + filaAtendimento.peek());
        System.out.println("---> " + filaAtendimento);
        System.out.println("");

        //Adicionar um novo cliente e verificar posição de inserção
        filaAtendimento.add("Daniel");
        System.out.println("----> " + filaAtendimento);
        System.out.println("");

        //Retornar Tamanho da fila
        System.out.println("-----> A fila possui " + filaAtendimento.size() + " elementos");

        //Verificar se Lista está Vazia
        System.out.println("------> Lista vazia? " + filaAtendimento.isEmpty());

        // Verificar se o nome Carlos está na fila
        System.out.println("-------> Existe nome Carlos? " + filaAtendimento.offer("Carlos"));
    }
}
