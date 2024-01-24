package aula13;

import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = 72.7 * altura - 58;

        System.out.println("O peso ideal para pessoas da sua altura é: " + pesoIdeal);

        sc.close();

    }

}
