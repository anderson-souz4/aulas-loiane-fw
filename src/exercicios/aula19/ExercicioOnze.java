package exercicios;

public class ExercicioOnze {

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 7, 9, 10, 25, 41, 54, 87 };
        int contador = 0;

        System.out.println("Numeros pares: ");
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                System.out.println(A[i]);
                contador++;
            }

        }
        System.out.println("Total: " + contador);

    }

}
