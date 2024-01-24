package exercicios;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois numeros: ");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("O maior numero é o: " + numeroUm);
        } else {
            System.out.println("O maior numero é o " + numeroDois);
        }

        sc.close();

    }

}
