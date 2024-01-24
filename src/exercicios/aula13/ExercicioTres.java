package aula13;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe dois numeros");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        int soma = numeroUm + numeroDois;
        
        System.out.println("A soma dos dois numeros é: "+ soma);

    }

}
