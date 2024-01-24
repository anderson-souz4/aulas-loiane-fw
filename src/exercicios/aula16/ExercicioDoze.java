package exercicios;

import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int valorHora;
        int horasTrabalhadas;
        double salarioBruto;
        double sindicato = 0.3;
        
        
        System.out.println("Qual valor da hora?");
        valorHora = sc.nextInt();
        System.out.println("Quantas horas foram trabalhadas esse mês? ");
        horasTrabalhadas = sc.nextInt();
        
        
        

        sc.close();

    }

}
