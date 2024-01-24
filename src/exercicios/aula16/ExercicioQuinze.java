package exercicios;

import java.util.Scanner;

public class ExercicioQuinze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Informe os 3 lados de um triângulo. ");
        ladoA = sc.nextInt();
        ladoB = sc.nextInt();
        ladoC = sc.nextInt();

        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("Triângulo equilátero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoA || ladoB == ladoC || ladoC == ladoA || ladoC == ladoA) {
            System.out.println("Triangulo Isósceles");
        } else if (ladoA != ladoB || ladoA != ladoC || ladoB != ladoA || ladoB != ladoC || ladoC != ladoA || ladoC != ladoB) {
            System.out.println("Triangulo Escaleno");
        }

        sc.close();

    }

}
