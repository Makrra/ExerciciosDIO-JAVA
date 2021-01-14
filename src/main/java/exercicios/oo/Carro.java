package exercicios.oo;

public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private String variante;
    public int passageiros, ano;

    // Construtores
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos de Acesso
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getVariante() { return variante; }
    public void setVariante(String variante) { this.variante = variante; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getPassageiros() {
            return passageiros;
        }
    public void setPassageiros(int passageiros) { this.passageiros = passageiros; }



}
