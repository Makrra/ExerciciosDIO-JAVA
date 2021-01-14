package exercicio.funcionarios;

public abstract class Funcionarios {
    //Atributos
    protected String nome;
    protected String cargo;
    protected Double salario;
    protected Double impostoAPagar;

    //Construtores
    public Funcionarios(){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Métodos de Acesso

    //Outros Métodos
    public Double calculaImposto(Double salario){
        this.impostoAPagar = (salario*0.001);
        return impostoAPagar;
    }

}
