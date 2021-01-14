package exercicio.funcionarios;

public class Gerente extends Funcionarios{
    //Atributos


    //Construtores
    public Gerente(String nome, String cargo, Double salario){
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
