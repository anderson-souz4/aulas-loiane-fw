package aula13;

import java.util.Scanner;

public class ExercicioDezesseis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double quantidadeMetrosASeremPintados;
        double coberturaDaTintaEmMetros = 3;
        double valorLataDeTinta = 80;
        double conteudoLata = 18;
        double contador = 0;

        System.out.println("Informe a quantidade de metros a serem pintados: ");
        quantidadeMetrosASeremPintados = sc.nextInt();

        double litrosDeTintasNecessarios = quantidadeMetrosASeremPintados / coberturaDaTintaEmMetros;

        System.out.println("Serão necessários " + litrosDeTintasNecessarios + " litros de tinta");
        double latasNecessarias = litrosDeTintasNecessarios / conteudoLata;

        System.out.println("Para a pintura será necessário " + Math.round(latasNecessarias) + " latas");

        sc.close();
    }

}
