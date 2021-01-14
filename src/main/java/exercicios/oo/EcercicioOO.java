package exercicios.oo;

public class EcercicioOO {

    public static void main(String[] args) {
        //Exemplo Carro
        Carro carro = new Carro("VM", "virtus", 2019);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());

    }
}
