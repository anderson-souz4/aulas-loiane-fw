package exercicios;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int populacaoA;
        int populacaoB;
        int cont = 0;
        int taxaDeCrescimentoA;
        int taxaDeCrescimentoB;

        System.out.println("Informe a cidade A: ");
        populacaoA = sc.nextInt();
        System.out.println("Informe a taxa de crescimento anual: ");
        taxaDeCrescimentoA = sc.nextInt();
        
        System.out.println("Informe a cidade B");
        populacaoB = sc.nextInt();
        System.out.println("Informe a taxa de crescimento anual: ;");
        taxaDeCrescimentoB = sc.nextInt();
        
        
        System.out.println();
        


        
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
