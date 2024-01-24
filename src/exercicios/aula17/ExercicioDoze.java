package exercicios;

import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorUsuario;
        int multiplicador = 0;
        int total = 0;

        System.out.println("Informe um número: ");
        valorUsuario = sc.nextInt();

        for (int x = 0; x < 10; x++) {
            total = valorUsuario * ++multiplicador;
            System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
        }

    }

}
