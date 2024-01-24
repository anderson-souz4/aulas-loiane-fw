package exercicios;

import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Numero impar: " + i);
            }

        }

    }

}
