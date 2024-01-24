package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int quantidadeDeNumerosPares = 0;
        int quantidadeDeNumerosImpares = 0;

        System.out.println("Informe 10 numeros inteiros: ");
        for (int i = 0; i < 10; i++) {
            numeros.add(sc.nextInt());
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                quantidadeDeNumerosPares++;
            } else {
                quantidadeDeNumerosImpares++;
            }
        }

        System.out.println("Numeros pares: " + quantidadeDeNumerosPares);
        System.out.println("Numeros Impares: " + quantidadeDeNumerosImpares);

        sc.close();
    }

}
