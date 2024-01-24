package aula13;

import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Fahrenheit para Celsius.");
        System.out.println("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("A temperatura é " + celsius);
        sc.close();

    }

}
