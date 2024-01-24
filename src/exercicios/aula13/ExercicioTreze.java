package aula13;

import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu sexo: m/f ");
        char sexo = sc.next().charAt(0);

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe o seu peso: ");
        int pesoInformado = sc.nextInt();

        if (sexo == 'm' || sexo == 'M') {
            double pesoIdealMasculino = 72.7 * altura - 58;
            if (pesoInformado > pesoIdealMasculino) {
                System.out.println("Você está acima do peso!");
                System.out.printf("O peso ideal para pessoas da sua altura é: %.2f ", pesoIdealMasculino);
            }

        } else if (sexo == 'f' || sexo == 'F') {
            double pesoIdealFeminino = 62.7 * altura - 44.7;
            if (pesoInformado > pesoIdealFeminino) {
                System.out.println("Você está acima do peso!");
                System.out.printf("O peso ideal para pessoas da sua altura é: %.2f ", pesoIdealFeminino);
            }

        }

        sc.close();
    }

}
