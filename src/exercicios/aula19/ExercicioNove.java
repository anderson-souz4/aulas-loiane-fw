package exercicios;

public class ExercicioNove {

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 7, 9, 10, 25, 41, 54 };
        int[] B = { 1, 3, 4, 7, 9, 10, 25, 41, 54 };

        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] / B[i];
        }

        System.out.println("Vetor A");
        ImprimeVetor.imprimirVetor(A);
        System.out.println("Vetor B");
        ImprimeVetor.imprimirVetor(B);

        System.out.println("Vetor C: ");
        ImprimeVetor.imprimirVetor(C);

    }

}
