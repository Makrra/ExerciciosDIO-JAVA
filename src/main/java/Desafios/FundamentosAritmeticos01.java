package Desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FundamentosAritmeticos01{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 6;
        String valor[] = new String[n];
        Double valorDouble[] = new Double[n];
        int count = 0;

        for (int i = 0; i < valor.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            valor[i] = String.valueOf(st.nextToken());
            valorDouble[i] = Double.parseDouble(valor[i]);

            if (valorDouble[i] > 0.0){
                count = count + 1;
            }
        }

        System.out.println(count + " valores positivos");

    }
}
