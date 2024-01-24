package exercicios;

import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioColaborador;
        System.out.println("Informe o salário do colaborador. ");
        salarioColaborador = sc.nextDouble();

        double aumentoColaborador = 0;
        

        if (salarioColaborador > 0 && salarioColaborador <= 280) {
            aumentoColaborador = (salarioColaborador / 100) * 0.2;
            System.out.println("Você recebeu um aumento de 20%");
        } else if (salarioColaborador > 280 && salarioColaborador <= 700) {
            aumentoColaborador = (salarioColaborador / 100) * 0.15;
            System.out.println("Você recebeu um aumento de 15%");
        } else if (salarioColaborador > 700 && salarioColaborador <= 1500) {
            aumentoColaborador += (salarioColaborador / 100) * 0.1;
            System.out.println("Você recebeu um aumento de 10%");
        } else {
            aumentoColaborador += (salarioColaborador / 100) * 0.5;
            System.out.println("Você recebeu um aumento de 5%");
        }
        System.out.println("Seu salário sem reajuste é: " + salarioColaborador);
        System.out.println("Você recebera " + aumentoColaborador + " % de aumento.");
        double salarioReajustado = salarioColaborador + aumentoColaborador;

        System.out.println("Seu sálario final é: " + salarioReajustado);

        sc.close();

    }

}
