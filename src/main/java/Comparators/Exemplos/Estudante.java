package Comparators.Exemplos;

/*
 * Interfaces que aprenderemos:
 * java.util.Comparator - Interface para definir classe com regra de ordenação
 * java.util.Comparable - Interface para definir regra de ordenação em uma classe de domínio
 *
 * Comparators e Comparables são interfaces da api de collections para podermos trabalhar ordenação de coleções
 *
 * Algoritmos de ordenação
 * Utilizado primariamente em java.util.list
 * Permite a ordenação de objetos complexos
 * */

public class Estudante implements Comparable<Estudante> { //Ordena o objeto que estamos olhando
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }

    public Integer getIdade() { return idade; }

    @Override
    public String toString() { return nome + " - " + idade; }

    @Override
    public int compareTo(Estudante o) { return this.getIdade() - o.getIdade(); }
}
