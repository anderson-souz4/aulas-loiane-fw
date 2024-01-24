package exercicios;
import java.util.Random;

public class MatrizAleatoria {

    public static void main(String[] args) {
        int linhas = 4;
        int colunas = 4;
        
        int[][] matriz = gerarMatrizAleatoria(linhas, colunas);

        // Imprimir a matriz
        System.out.println("Matriz gerada:");
        imprimirMatriz(matriz);

        // Encontrar o maior número e sua posição
        int[] posicaoMaiorNumero = encontrarMaiorNumero(matriz);

        // Imprimir o maior número e sua posição
        System.out.println("O maior número é: " + matriz[posicaoMaiorNumero[0]][posicaoMaiorNumero[1]]);
        System.out.println("Posição (linha, coluna): (" + posicaoMaiorNumero[0] + ", " + posicaoMaiorNumero[1] + ")");
    }

    // Método para gerar uma matriz com valores aleatórios entre 0 e 9
    private static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(10); // Gera números aleatórios entre 0 e 9
            }
        }

        return matriz;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para encontrar o maior número e sua posição na matriz
    private static int[] encontrarMaiorNumero(int[][] matriz) {
        int[] posicao = {0, 0}; // Inicializa com a posição (0, 0)
        
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

        return posicao;
    }
    private static int[] encontrarMenorNumero(int[][] matriz) {
        int[] posicao = {0, 0}; // Inicializa com a posição (0, 0)
        
        int menorNumero = matriz[0][0];
        
        for (int i = 0; i > matriz.length; i++) {
            for (int j = 0; j > matriz[i].length; j++) {
                if (matriz[i][j] > menorNumero) {
                    menorNumero = matriz[i][j];
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
        }
        
        return posicao;
    }
}
