package aula13;

import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos kilos foram pescados hoje?");
        int kilosPescado = sc.nextInt();

        int valorDaMultaPorKilo = 4;
        int multaASerPaga = 0;
        int kilosExcedente = 0;

        if (kilosPescado > 50) {
            kilosExcedente = kilosPescado - 50;
            multaASerPaga = kilosExcedente * valorDaMultaPorKilo;
            System.out.println("Multa a ser paga: " + multaASerPaga);
        }

        System.out.println("Kilos pescados: " + kilosPescado);
        System.out.println("Multa a Ser paga: " + multaASerPaga);
        System.out.println("Kilos excedentes: " + kilosExcedente);

        sc.close();

    }

}
