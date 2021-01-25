package Comparators.ExercicioProposto;

import Comparators.ExercicioProposto.ClasseLivro;

import java.util.Comparator;

public class ComparatorNomeAutorCrescente implements Comparator<ClasseLivro> {
    @Override
    public int compare(ClasseLivro o1, ClasseLivro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
