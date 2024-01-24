package exercicios;

import java.util.Random;

public class ExercicioDois {
    public static void main(String[] args) {

        int linhas = 10;
        int colunas = 10;

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

        int[] posicaoMenorNumero = { 0, 0 }; // Inicializa com a posição (0, 0)

        int menorNumero = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menorNumero) {
                    menorNumero = matriz[i][j];
                    posicaoMenorNumero[0] = i;
                    posicaoMenorNumero[1] = j;
                }
            }
        }

        int[] posicaoMaiorNumero = posicao;
        System.out.println("O maior número é: " + matriz[posicaoMaiorNumero[0]][posicaoMaiorNumero[1]]);
        System.out.println("Posição (linha, coluna): (" + posicaoMaiorNumero[0] + ", " + posicaoMaiorNumero[1] + ")");

        System.out.println("O menor número é: " + matriz[posicaoMenorNumero[0]][posicaoMenorNumero[1]]);
        System.out.println("Posição (linha, coluna): (" + posicaoMenorNumero[0] + ", " + posicaoMenorNumero[1] + ")");
    }
}
