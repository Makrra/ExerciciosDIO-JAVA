package Comparators.ExercicioProposto;

import java.util.Comparator;

public class ComparatorNomeLivroDecrescente implements Comparator<ClasseLivro> {
    @Override
    public int compare(ClasseLivro o1, ClasseLivro o2) {
        return o2.getTitulo().compareTo(o1.getTitulo());
    }
}
