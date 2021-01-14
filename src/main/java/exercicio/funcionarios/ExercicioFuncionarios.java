package exercicio.funcionarios;

public class ExercicioFuncionarios {
    public static void main(String[] args) {

        //Exemplo Funcionários
        Gerente joao = new Gerente("João", "Gerente", 15000.00);
        Supervisor maria = new Supervisor("Maria", "Supervisora", 7000.00);
        Atendente carlos = new Atendente("Carlos", "Atendente", 2000.00);

        System.out.println(joao.getNome() + " - " + joao.getCargo() + " - " + joao.getSalario() + " R$" + " - " + joao.calculaImposto(joao.getSalario()) + " R$");
        System.out.println(maria.getNome() + " - " + maria.getCargo() + " - " + maria.getSalario() + " R$" + " - " + maria.calculaImposto(maria.getSalario()) + " R$");
        System.out.println(carlos.getNome() + " - " + carlos.getNome() + " - " + carlos.getSalario() + " R$" + " - " + carlos.calculaImposto(carlos.getSalario()) + " R$");
    }
}
