package exercicio.funcionarios;

public class Atendente extends Funcionarios{
    //Atributos

    //Construtores
    public Atendente(String nome, String cargo, Double salario){
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    //Métodos de Acesso
    public String getNome() { return nome; }

    public String getCargo() { return cargo; }

    public Double getSalario() { return salario; }

    //Outros Métodos
}
