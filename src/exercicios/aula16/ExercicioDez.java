package exercicios;

import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual turno você estuda? M/V/N");
        System.out.println("M- Matutivo, V- Vespertino, N-Noturno");

        char turno = sc.next().charAt(0);

        switch (turno) {
            case 'm':
                System.out.println("Bom dia");
                break;
            case 'v':
                System.out.println("Boa tarde");
                break;
            case 'n':
                System.out.println("Boa noite");
            case 'M':
                System.out.println("Bom dia");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
            default:
                System.out.println("Turno inválido");
                break;
        }

        sc.close();

    }

}
