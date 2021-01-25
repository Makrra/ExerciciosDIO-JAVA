package Comparators.ExercicioProposto;

import java.util.Comparator;

public class ComparatorGetIdCrescente implements Comparator<ClasseLivro> {
    @Override
    public int compare(ClasseLivro o1, ClasseLivro o2) {
        //Conversão de Double para Integer
        String o1GetIdString = String.valueOf(o1.getId());
        Integer o1GetIdInt = Integer.valueOf(o1GetIdString);

        String o2GetIdString = String.valueOf(o2.getId());
        Integer o2GetIdInt = Integer.valueOf(o2GetIdString);

        return   o1GetIdInt - o2GetIdInt;
    }
}
