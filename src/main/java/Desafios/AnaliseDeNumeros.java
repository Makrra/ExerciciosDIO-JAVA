package Desafios;

/*
* Você deve fazer a leitura de 5 valores inteiros.
* Em seguida mostre quantos valores informados são pares,
* quantos valores informados são ímpares,
* quantos valores informados são positivos e
* quantos valores informados são negativos.
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnaliseDeNumeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 5;
        Integer numeros[] = new Integer[n];
        int countPar = 0;
        int countImpar = 0;
        int countPositivo = 0;
        int countNegativo = 0;

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            numeros[i] = Integer.valueOf(st.nextToken());

            if (numeros[i] % 2 != 0) {
                countImpar = countImpar + 1;
            } else { countPar = countPar + 1; }

            if (numeros[i] > 0) {
                countPositivo = countPositivo + 1;
            }

            if (numeros[i] < 0) {
                countNegativo = countNegativo + 1;
            }
        }

        System.out.println(
                countPar + " valor(es) par(es)\n " +
                countImpar + " valor(es) impar(es)\n " +
                countPositivo + " valor(es) positivo(s)\n " +
                countNegativo + " valor(es) negativo(s)");
    }
}
