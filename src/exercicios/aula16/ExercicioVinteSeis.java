package exercicios;

import java.util.Scanner;

public class ExercicioVinteSeis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double descontoAteVinteLitrosAlcool = 0.03;
        double descontoAcimaVinteLitrosAlcool = 0.05;
        double descontoAcimaVinteLitrosGasolina = 0.0;
        double descontoGasolinaAteVinteLitros = 0.04;
        char tipoCombustivel;
        double precoGasolina = 2.50;
        double precoAlcool = 1.90;
        double litrosASeremAbastecidos;

        System.out.println("Quantos litros deseja reabastecer?: ");
        litrosASeremAbastecidos = sc.nextDouble();
        System.out.println("Qual o tipo do combustivel : ");
        tipoCombustivel = sc.next().charAt(0);
        
        

        sc.close();

    }

}
