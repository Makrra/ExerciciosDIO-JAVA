package exercicio.funcionarios;

public class Supervisor extends Funcionarios{
    //Atributos

    //Construtores
    public Supervisor(String nome, String cargo, Double salario){
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

    @Override
    public Double calculaImposto(Double salario) {
        this.impostoAPagar = (salario*0.005);

        return impostoAPagar;
    }
}
