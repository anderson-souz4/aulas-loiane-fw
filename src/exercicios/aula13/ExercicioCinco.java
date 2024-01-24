package aula13;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        System.out.println("Informa o tamanho em Metros: ");
        Scanner sc = new Scanner(System.in);
        int valorCentimetros = sc.nextInt();

        int converterMetrosParaCentimetro = valorCentimetros * 100;

        System.out.printf("O valor convertido em centmetros é: %s CM", converterMetrosParaCentimetro);

        sc.close();

    }

}
