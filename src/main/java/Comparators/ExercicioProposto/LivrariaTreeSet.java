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

import java.util.*;

public class LivrariaTreeSet {
    public static void main(String[] args) {
        TreeSet<ClasseLivro> controleLivros = new TreeSet<>(new ComparatorLucroDecrescente());

        // ---> Criando Lista de Livros
        controleLivros.add(new ClasseLivro(8574, "Rafael Peixoto", "Selenium WebDriver","Casa do Código",29.90, 30.00));
        controleLivros.add(new ClasseLivro(8964, "Marcos Brizeno", "Refatorando com padrões de projeto","Casa do Código",49.90, 27.50));
        controleLivros.add(new ClasseLivro(1247, "Fernando Boaglio", "Spring Boot","Casa do Código",29.90, 25.00));
        controleLivros.add(new ClasseLivro(3549, "Hugo Kotsubo", "Datas e horas","Casa do Código",69.90, 25.00));
        controleLivros.add(new ClasseLivro(7961, "João Paulo Maida", "Teoria dos Grafos","Casa do Código",29.90, 31.00));
        controleLivros.add(new ClasseLivro(7649, "Dean Wampler", "Programação Funcional Para Desenvolvedores Java","O'REILLY Novatec Editora",31.20, 27.50));
        controleLivros.add(new ClasseLivro(2105, "Rui Rossi dos Santos", "Programação de Computadores em Java","Novaterra", 99.00, 27.50));
        controleLivros.add(new ClasseLivro(3493, "David J. Barnes", "Programação Orientada a Objetos com Java: Uma Introdução Prática Usando o BlueJ","Pearson Universidades",134.24, 27.50));
        controleLivros.add(new ClasseLivro(4698, "Peter Jandl Junior", "Java Guia do Programador - 3ª Edição: Atualizado Para Java 8","Novatec Editora",83.30, 25.50));
        controleLivros.add(new ClasseLivro(4712, "Herbert Schildt", "Java para Iniciantes: Crie, Compile e Execute Programas Java Rapidamente","Bookman",105.99, 22.40));


        // ---> Navegando pelos livros
        Iterator<ClasseLivro> iterator = controleLivros.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getValorLucro());
        }
    }
}
