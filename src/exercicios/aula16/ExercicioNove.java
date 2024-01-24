package exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numerosInformados = new int[3];

        System.out.println("Informe três numeros: ");
        numerosInformados[0] = sc.nextInt();
        numerosInformados[1] = sc.nextInt();
        numerosInformados[2] = sc.nextInt();

        for (int i = 0; i < numerosInformados.length; i++) {
            System.out.println(Arrays.asList(numerosInformados).stream().sorted(Collections.reverseOrder()).toString());
        }

        sc.close();

    }

}
