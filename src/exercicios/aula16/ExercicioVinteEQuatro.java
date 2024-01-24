package exercicios;

import java.util.Scanner;

public class ExercicioVinteEQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int resultadoEquacao = 0;
        char operacao;

        System.out.println("Informe dois numeros: ");
        int numeroInformadoUm = sc.nextInt();
        int numeroInformadoDois = sc.nextInt();

        System.out.println("Qual operação deseja realizar: ");
        System.out.println("+ SOMA : ");
        System.out.println("- SUBTRAÇÂO");
        System.out.println("* MULTIPLICAÇÃO");
        System.out.println("/ DIVISÃO");
        operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                resultadoEquacao = numeroInformadoUm + numeroInformadoDois;
                break;
            case '-':
                resultadoEquacao = numeroInformadoUm - numeroInformadoDois;
                break;
            case '*':
                resultadoEquacao = numeroInformadoUm * numeroInformadoDois;
                break;
            case '/':
                resultadoEquacao = numeroInformadoUm / numeroInformadoDois;
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }

        System.out.println("Resultado: " + resultadoEquacao);
        System.out.println();

        if (resultadoEquacao % 1 == 0) {
            System.out.println("Numero inteiro");
        } else {
            System.out.println("Numero decimal ");
        }

        if (resultadoEquacao % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero ímpar");
        }

        if (resultadoEquacao < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero positivo");
        }
        sc.close();

    }

}
