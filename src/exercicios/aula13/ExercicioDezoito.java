package aula13;

import java.util.Scanner;

public class ExercicioDezoito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo: ");
        double tamanhoArquivo = sc.nextDouble();

        System.out.println("Informe a velocidade da internet: ");
        double velocidadeInternet = sc.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;

        System.out.println("Tempo aproximado de download: "+ tempo);

        sc.close();
    }

}
