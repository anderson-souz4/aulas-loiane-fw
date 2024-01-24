package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letraInformada = sc.next().charAt(0);

        if (letraInformada == 'a' || letraInformada == 'e' || letraInformada == 'i' || letraInformada == 'o'
                        || letraInformada == 'u') {
            System.out.println("A letra informada é uma vogal.");
        } else {
            System.out.println("A letra informada é uma consoante.");
        }

        sc.close();

    }

}
