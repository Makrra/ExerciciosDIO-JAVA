package StreamAPI.exerciciospropostos;

/*
* 1 - Utilizando uma lista com um objeto complexo realize as seguintes operações:
* > Transforme cada aluno em uma String com os atributos do objeto
* > Conte a quantidade de alunos tem na coleção
* > Filtre os alunos com a idade igual ou superior a 18 anos
* > Retorne alunos com nome que possui a letra B
* > Retorne se existe ao menos um aluno com a letra D no nome
* > Retorne o aluno mais velho da coleção. Retornar o mais novo também
* */

public class Aluno {
    //Atributos
    private String nome;
    private int idade;

    //Contrutores
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Outros Métodos

    @Override
    public String toString() {
        return nome + " - " +
                idade;
    }
}
