package Desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FundamentosAritmeticos01{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //Lê linha de entrada
        int n = 5;
        String valor[] = new String[n];
        Double valorDouble[] = new Double[n];
        int count = 0;

        for (int i = 0; i < valor.length; i++) {
            st = new StringTokenizer(br.readLine());
            valor[i] = String.valueOf(st.nextElement());
            valorDouble[i] = Double.parseDouble(valor[i]);

            if (valorDouble[i] > 0.0){
                count = count + 1;
            }

            System.out.println(count);

        }

        System.out.println(count + " valores positivos");


        //        valor[0] = String.valueOf(st.nextToken());
//        valorDouble[0] = Double.parseDouble(valor[0]);
////
////        st = new StringTokenizer(br.readLine());
////        valor[1] = String.valueOf(st.nextToken());
////        valorDouble[1] = Double.parseDouble(valor[1]);
////
////        st = new StringTokenizer(br.readLine());
////        valor[2] = String.valueOf(st.nextToken());
////        valorDouble[2] = Double.parseDouble(valor[2]);
////
////        st = new StringTokenizer(br.readLine());
////        valor[3] = String.valueOf(st.nextToken());
////        valorDouble[3] = Double.parseDouble(valor[3]);
////
////        st = new StringTokenizer(br.readLine());
////        valor[4] = String.valueOf(st.nextToken());
////        valorDouble[4] = Double.parseDouble(valor[4]);
////
////        st = new StringTokenizer(br.readLine());
////        valor[5] = String.valueOf(st.nextToken());
////        valorDouble[5] = Double.parseDouble(valor[5]);


    }
}
