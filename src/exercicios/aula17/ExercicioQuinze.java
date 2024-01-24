package exercicios;

import java.util.Scanner;

public class ExercicioQuinze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de termos da sequência Fibonacci que deseja gerar: ");
        int n = sc.nextInt();

        System.out.println("Os primeiros " + n + " termos da sequência Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
