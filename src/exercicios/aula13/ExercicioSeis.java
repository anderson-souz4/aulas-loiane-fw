package aula13;

import java.util.Scanner;
import static java.lang.Math.PI;

public class ExercicioSeis {

    public static void main(String[] args) {

        System.out.println("Informe o raio do circulo");
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = Math.PI;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A area do circulo é: %.2f", area);

        sc.close();

    }

}
