package exercicios;

public class ExercicioTreze {

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 7, 9, 10, 25, 41, 54, 87 };
        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 5 == 0)
                System.out.println("Multiplo de 5: "+ A[i]);
                soma += A[i];
        }
        System.out.println("A soma de todos os elementos multiplos de 5: " + soma);

    }

}


