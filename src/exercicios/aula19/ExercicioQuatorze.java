package exercicios;

public class ExercicioQuatorze {

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 7, 9, 10, 25, 41, 54, 87 };
        int soma = 0;
        int impar = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                soma += A[i];
                impar++;
            }
        }
        System.out.println("A soma: " + soma);
        System.out.println("média: " + soma / impar);

    }

}
