package exercicios;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media = 7;
        double somaDasNotas;

        System.out.println("Informe duas notas parciais: ");
        double notaUm = sc.nextDouble();
        double notaDois = sc.nextDouble();

        somaDasNotas = notaUm + notaDois;

        if (somaDasNotas < 7) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno aprovado.");
        }

        sc.close();

    }

}
