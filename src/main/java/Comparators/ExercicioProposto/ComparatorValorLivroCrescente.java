package Comparators.ExercicioProposto;

import java.util.Comparator;

public class ComparatorValorLivroCrescente implements Comparator<ClasseLivro> {
    @Override
    public int compare(ClasseLivro o1, ClasseLivro o2) {
        return o1.getValor().compareTo(o2.getValor());
    }
}
