package exercicios;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int numeroInformado = sc.nextInt();

        if (numeroInformado < 0) {
            System.out.println("O numero é negativo.");

        } else {
            System.out.println("O Numero é positivo. ");
        }

        sc.close();

    }

}
