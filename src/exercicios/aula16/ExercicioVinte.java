package exercicios;

import java.util.Scanner;

public class ExercicioVinte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int notaUm = 0;
        int notaDois = 0;
        int notaTres = 0;

        System.out.println("Informe 3 notas parciais.: ");
        notaUm = sc.nextInt();
        notaDois = sc.nextInt();
        notaTres = sc.nextInt();
        int media = (notaUm + notaDois + notaTres) / 3;

        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }

        sc.close();

    }

}
