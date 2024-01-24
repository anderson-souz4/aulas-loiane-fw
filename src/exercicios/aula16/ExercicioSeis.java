package exercicios;

import java.util.List;
import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três numeros: ");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        int numeroTres = sc.nextInt();

        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("O maior numero é o: " + numeroUm);
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            System.out.println("O maior numero é o: " + numeroDois);
        } else if (numeroTres > numeroUm && numeroTres > numeroDois) {
            System.out.println("O maior numero é o " + numeroTres);
        }

        sc.close();

    }

}
