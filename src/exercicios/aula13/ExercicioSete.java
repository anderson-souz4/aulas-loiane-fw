package aula13;

import java.util.Scanner;
import static java.lang.Math.PI;

public class ExercicioSete {

    public static void main(String[] args) {

        System.out.println("Informe o raio do quadrado");

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        System.out.println("O raio informado foi: " + raio);

        double pi = Math.PI;

        double area = pi * (Math.pow(raio, 2));

        System.out.println("O dobro da area do raio do circulo informado é: " + area);

        sc.close();

    }

}
