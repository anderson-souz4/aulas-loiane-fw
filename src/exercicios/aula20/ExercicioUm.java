package exercicios;

import java.util.Random;

public class ExercicioUm {
    public static void main(String[] args) {

        int linhas = 4;
        int colunas = 4;

        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        int[] posicao = { 0, 0 };

        int maiorNumero = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorNumero) {
                    maiorNumero = matriz[i][j];
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
        }
        int[] posicaoMaiorNumero = posicao;
        System.out.println("O maior número é: " + matriz[posicaoMaiorNumero[0]][posicaoMaiorNumero[1]]);
        System.out.println("Posição (linha, coluna): (" + posicaoMaiorNumero[0] + ", " + posicaoMaiorNumero[1] + ")");
    }
}
