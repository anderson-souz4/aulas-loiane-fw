package exercicios;

import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroUm = 0;
        int numeroDois = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        System.out.println("Informe dois numeros inteiros.");
        numeroUm = sc.nextInt();
        numeroDois = sc.nextInt();

        if (numeroUm > numeroDois) {
            maiorNumero = numeroUm;
            menorNumero = numeroDois;
        } else {
            maiorNumero = numeroDois;
            menorNumero = numeroUm;
        }

        for (int i = menorNumero; i < maiorNumero; i++) {
            if (i % 1 == 0) {
                System.out.println(i);

            }
        }
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);

    }

}
