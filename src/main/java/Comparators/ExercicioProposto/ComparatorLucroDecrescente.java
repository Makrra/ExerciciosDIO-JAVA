package Comparators.ExercicioProposto;

import java.util.Comparator;

public class ComparatorLucroDecrescente implements Comparator<ClasseLivro> {
    @Override
    public int compare(ClasseLivro o1, ClasseLivro o2) {
        return o2.getValorLucro().compareTo(o1.getValorLucro());
    }
}

