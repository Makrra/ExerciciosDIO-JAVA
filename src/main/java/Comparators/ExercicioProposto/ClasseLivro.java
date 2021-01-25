package Comparators.ExercicioProposto;

/*
 * 1 - Crie uma lista de objeto complexo e execute as seguintes operações:
 * - Adicione elementos nessa lista;
 * - Ordene implementando a interface java.util.Comparator no seu objeto complexo;
 * - Ordene implementando um novo objeto com a interface java.util.Comparable;
 * - Ordene usando a expressão lambda na chamada de suaLista.sort();
 * - Ordene usando referências de métodos e os métodos estáticos Comparator;
 * - Ordene coleções TreeSet e TreeMap
 * */

import java.text.DecimalFormat;

public class ClasseLivro implements Comparable<ClasseLivro>{
    //Atributos
    private Integer id;
    private String autor;
    private String titulo;
    private String editora;
    private Double valor, imposto, valorLucro;

    //Construtores
    public ClasseLivro(Integer id, String autor, String titulo, String editora, Double valor, Double imposto) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.valor = valor;
        this.imposto = imposto;
    }

    //Convertendo para formato desejado
    DecimalFormat df1 = new DecimalFormat("##,## %");
    DecimalFormat df2 = new DecimalFormat("##.## R$");

    //Métodos de Acesso a Classe
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public Double getImposto() { return imposto; }
    public void setImposto(Double imposto) { this.imposto = imposto; };

    public Double getValorLucro() { return (100-imposto); }
    public void setValorLucro(Double valorLucro) { this.valorLucro = valorLucro; }


    //Outros Métodos

    @Override
    public String toString() {
        return  "id=" + id +
                ", autor= '" + autor + '\'' +
                ", titulo= '" + titulo + '\'' +
                ", editora= '" + editora + '\'' +
                ", valor= " + df2.format(getValor()) +
                ", valorLucro= " + df1.format(getValorLucro()) +
                '}';
    }

    @Override
    public int compareTo(ClasseLivro o) { return this.getId() - o.getId(); }
}
