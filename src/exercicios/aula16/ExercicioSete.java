package exercicios;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 3 numeros: ");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        int numeroTres = sc.nextInt();

        List<Integer> numerosInformados = List.of(numeroUm, numeroDois, numeroTres);

        Integer maior = numerosInformados.stream().mapToInt(v -> v).max().orElseThrow();
        Integer menor = numerosInformados.stream().mapToInt(v -> v).min().orElseThrow();

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        sc.close();

    }

}
