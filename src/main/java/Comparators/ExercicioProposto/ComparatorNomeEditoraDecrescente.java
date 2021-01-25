package Comparators.ExercicioProposto;

import java.util.Comparator;

public class ComparatorNomeEditoraDecrescente implements Comparator<ClasseLivro> {
    @Override
    public int compare(ClasseLivro o1, ClasseLivro o2) {
        return o2.getEditora().compareTo(o1.getEditora());
    }
}
