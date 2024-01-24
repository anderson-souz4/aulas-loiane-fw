package exercicios;

import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        int numeroTres;
        int numeroQuatro;
        int numeroCinco;

        System.out.println("Informe 5 numeros: ");
        numeroUm = sc.nextInt();
        numeroDois = sc.nextInt();
        numeroTres = sc.nextInt();
        numeroQuatro = sc.nextInt();
        numeroCinco = sc.nextInt();

        int maiorNumero = numeroUm;

        if (numeroDois > maiorNumero) {
            maiorNumero = numeroDois;
        }

        if (numeroTres > maiorNumero) {
            maiorNumero = numeroTres;
        }

        if (numeroQuatro > maiorNumero) {
            maiorNumero = numeroQuatro;
        }

        if (numeroCinco > maiorNumero) {
            maiorNumero = numeroCinco;
        }

        System.out.println("O maior número é: " + maiorNumero);

        sc.close();
    }

}
