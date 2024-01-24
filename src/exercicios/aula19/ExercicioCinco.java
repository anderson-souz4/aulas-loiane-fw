package exercicios;

public class ExercicioCinco {

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 7, 9 , 10, 25, 41, 54};

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        System.out.println("Vetor A: ");
        ImprimeVetor.imprimirVetor(A);

        System.out.println("Vetor B (cópia de A): ");
        ImprimeVetor.imprimirVetor(B);
    }

}

