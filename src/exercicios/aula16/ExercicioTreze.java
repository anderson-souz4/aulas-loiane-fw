package exercicios;

import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaDaSemana;
        System.out.println("Informe um numero de 1 a 7.");
        diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Numero inválido.");
                break;
        }

        sc.close();

    }

}
