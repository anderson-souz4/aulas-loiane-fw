package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int populacaoA = 80000;
        int populacaoB = 200000;
        int cont = 0;

        
        while(populacaoA < populacaoB) {
            populacaoA += (populacaoA) * 3; 
            populacaoB += (populacaoA) * 1.5;
            cont++;
        }
        
        System.out.println("População A");
        System.out.println("população B");
        System.out.println("Qtd anos");
        
        sc.close();
    }

}
