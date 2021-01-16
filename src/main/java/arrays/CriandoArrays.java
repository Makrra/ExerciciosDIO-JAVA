package arrays;

public class CriandoArrays {
    public static void main(String[] args) {
        int[] meuArray = new int[7];
        int[] meuArray2 = {2, 5, 7, 10, 99, 81};

        System.out.println(meuArray);
        System.out.println(meuArray2);

        //Alterando o valor de um elemento
        meuArray2[1] = 10;
        System.out.println(meuArray2[1]);

        //Comprimento do Array
        System.out.println(meuArray.length);

        //Percorrendo o Array
        for (int i=0; i<6; i++){
            System.out.println(meuArray2[i]);
        }

        // Array Multidimenssional
        int[][] meuArray3 = { {3, 4, 5}, {6, 8, 9}};

        //Percorrendo Array Multidimenssional
        for (int l=0; l < meuArray3.length; l++){
            for (int j=0; j < meuArray3[l].length; j++){
                System.out.println(meuArray3[l][j]);
            }
        }

        System.out.println(meuArray3.length);
    }
}
