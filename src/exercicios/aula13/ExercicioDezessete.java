package aula13;

import java.util.Scanner;

public class ExercicioDezessete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double quantidadeMetrosASeremPintados;
        double coberturaDaTintaEmMetros = 6;
        double valorLataDeTintaDezoito = 80;
        double valorLataDeTintaTresLitrosEMeio = 25;
        double conteudoLataDezoitoLitro = 18;
        double conteudoLataDezoitoTresLitrosEMeio = 3.6;

        System.out.println("Informe a quantidade de metros a serem pintados: ");
        quantidadeMetrosASeremPintados = sc.nextInt();

        double litrosDeTintasNecessarios = quantidadeMetrosASeremPintados / coberturaDaTintaEmMetros;

        double latasNecessariasDezoitoLitro = Math.round(litrosDeTintasNecessarios / conteudoLataDezoitoLitro);
        double latasNecessariasTresLitrosEMeio = Math.round(litrosDeTintasNecessarios / conteudoLataDezoitoTresLitrosEMeio);

        System.out.println("Serão necessários " + litrosDeTintasNecessarios + " litros de tinta");

        System.out.println("Para a pintura será necessário " + latasNecessariasDezoitoLitro + " latas de 18 litros");
        System.out.println("Para a pintura será necessário " + latasNecessariasTresLitrosEMeio + " latas de 3.6 litros");

        System.out.println("O valor para tintas de 18L fica " + latasNecessariasDezoitoLitro * valorLataDeTintaDezoito + " R$");
        System.out.println("O valor para tintas de 3.6L fica " + latasNecessariasTresLitrosEMeio * valorLataDeTintaTresLitrosEMeio
                        + " R$");

        sc.close();
    }

}
