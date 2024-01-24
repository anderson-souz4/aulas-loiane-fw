package exercicios;

import java.util.Scanner;

public class ExercicioVinteTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double numeroInformado = sc.nextDouble();

        if (numeroInformado % 1 == 0) {
            System.out.println("Numero inteiro");
        } else {
            System.out.println("Numero decimal ");
        }

        sc.close();

    }

}
