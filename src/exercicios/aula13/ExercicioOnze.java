package aula13;

import java.util.Scanner;
import static java.lang.Math.pow;

public class ExercicioOnze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois numeros inteiros: ");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        System.out.println("Informe um numero real: ");
        double numeroReal = sc.nextDouble();

        int produtoDoDobroDoPrimeiroComMetadeDoSegundo = numeroUm * 2 * (numeroDois / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + produtoDoDobroDoPrimeiroComMetadeDoSegundo);

        double somaDoTriploDoPrimeiroComOTerceiro = numeroUm * 3 + numeroReal;
        System.out.println("A soma do triplo do primeiro com o terceiro" + somaDoTriploDoPrimeiroComOTerceiro);

        double terceiroElevadoAoCubo = Math.pow(numeroReal, 3);
        System.out.println("O terceiro numero elevado ao cubo " + terceiroElevadoAoCubo);

        sc.close();

    }

}
