package exercicios;

import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroUm;
        double numeroDois;

        System.out.println("Informe duas notas parciais.");
        numeroUm = sc.nextDouble();
        numeroDois = sc.nextDouble();

        double media = (numeroUm + numeroDois) / 2;

        if (media > 0 && media < 4) {
            System.out.println("Conceito E");

        } else if (media > 4 && media < 6) {
            System.out.println("Conceito D");

        } else if (media > 6 && media < 7.5) {

            System.out.println("Conceito C");
        } else if (media > 7.5 && media < 9.0) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Conceito A");
        }

        sc.close();

    }

}
