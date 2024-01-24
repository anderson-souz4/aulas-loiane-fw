package exercicios;

import java.util.List;
import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de três produtos: ");
        double valorProdutoUm = sc.nextDouble();
        double valorProdutoDois = sc.nextDouble();
        double valorProdutoTres = sc.nextDouble();

        double produtoMaisBarato = 0;

        if (valorProdutoUm < valorProdutoDois && valorProdutoUm < valorProdutoTres) {
            produtoMaisBarato = valorProdutoUm;
            System.out.println("O produto mais barato é: " + produtoMaisBarato);
        } else if (valorProdutoDois < valorProdutoUm && valorProdutoDois < valorProdutoTres) {
            produtoMaisBarato = valorProdutoDois;
            System.out.println("O produto mais barato é: " + produtoMaisBarato);
        } else if (valorProdutoTres < valorProdutoUm && valorProdutoTres < valorProdutoDois) {
            produtoMaisBarato = valorProdutoTres;
            System.out.println("O produto mais barato é: " + produtoMaisBarato);
        }

        System.out.println("O produto que você deve comprar é com o valor : " + produtoMaisBarato);

        sc.close();

    }

}
