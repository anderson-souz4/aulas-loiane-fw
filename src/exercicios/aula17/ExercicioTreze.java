package exercicios;

import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroBase = 0;
        int numeroExponente = 0;
        int potencia = 1;

        System.out.println("Informe a base: ");
        numeroBase = sc.nextInt();
        System.out.println("Informe o exponente: ");
        numeroExponente = sc.nextInt();

        for (int i = 1; i <= numeroExponente; i++) {
            potencia *= numeroBase;
        }

        System.out.println("A potencia é: " + potencia);
        System.out.println("potencia com Math.pow: " + Math.pow(numeroBase, numeroExponente));

        sc.close();
    }

}
