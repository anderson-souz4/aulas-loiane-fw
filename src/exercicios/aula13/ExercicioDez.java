package aula13;

import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Celsius para Fahrenheit.");
        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheint = celsius * 1.8 + 32;

        System.out.println("A temperatura é " + fahrenheint);
        sc.close();
    }

}
