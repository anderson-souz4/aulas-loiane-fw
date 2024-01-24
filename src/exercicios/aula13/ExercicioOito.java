package aula13;

import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora trabalhada?");
        double valorHora = sc.nextDouble();
        System.out.println("Quantas horas foram trabalhadas esse mês?");
        double horasTrabalhadas = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("Você trabalhou %s horas, e o seu salário é de: %s ", horasTrabalhadas, salario);

        sc.close();
    }

}
