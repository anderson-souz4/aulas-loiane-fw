package aula13;

import java.util.Scanner;

public class ExercicioQuinze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?: ");
        double valorPorHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalhou este mes?: ");
        double horasTrabalhadas = sc.nextDouble();

        double impostoDeRenda = 0.11;
        double INSS = 0.8;
        double sindicato = 0.5;
        double salarioBruto = horasTrabalhadas * valorPorHora;

        double impostoDeRendaCalculado = (salarioBruto * impostoDeRenda) / 100;

        double calculoInss = (salarioBruto * INSS) / 100;
        double calculoSindicato = (salarioBruto * sindicato) / 100;

        double salarioLiquido = salarioBruto - impostoDeRenda - INSS - calculoSindicato;

        System.out.println("Salario Bruto: R$" + salarioBruto);
        System.out.println("IR: R$" + impostoDeRendaCalculado);
        System.out.println("INSS: R$" + calculoInss);
        System.out.println("Sindicato: R$" + calculoSindicato);
        System.out.println("Salario Liquido: R$" + salarioLiquido);

        sc.close();

    }

}
