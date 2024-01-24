package exercicios;

public class ExercicioQuatro {

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 7, 9 , 10, 25, 41, 54, 87, 14, 4, 64, 74, 32};

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = (int) Math.sqrt(A[i]);
        }

        System.out.println("Vetor A: ");
        ImprimeVetor.imprimirVetor(A);

        System.out.println("Vetor B (cópia de A): ");
        ImprimeVetor.imprimirVetor(B);
    }

}

