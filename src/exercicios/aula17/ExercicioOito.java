package exercicios;

import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        int numeroTres;
        int numeroQuatro;
        int numeroCinco;
        int soma;
        int media;

        System.out.println("Informe 5 numeros: ");
        numeroUm = sc.nextInt();
        numeroDois = sc.nextInt();
        numeroTres = sc.nextInt();
        numeroQuatro = sc.nextInt();
        numeroCinco = sc.nextInt();

        soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco;

        media = soma / 5;

        System.out.println("A Soma: " + soma);
        System.out.println("A Média: " + media);

    }

}
