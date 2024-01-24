package aula13;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe suas quatro notas bimestrais: ");

        List<Integer> notas = new ArrayList<>();

        int notaUm = sc.nextInt();
        int notaDois = sc.nextInt();
        int notaTres = sc.nextInt();
        int notaQuatro = sc.nextInt();

        notas.add(notaUm);
        notas.add(notaDois);
        notas.add(notaTres);
        notas.add(notaQuatro);

        double media = notas.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println("A média das notas é: " + media);
        sc.close();

    }

}
