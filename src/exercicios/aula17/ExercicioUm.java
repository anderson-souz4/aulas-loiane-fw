package exercicios;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int nota = 0;

        System.out.println("Informe uma nota: ");
        nota = sc.nextInt();

        while (nota <= 10 && nota >= 0) {
            System.out.println("Informe uma nota: ");
            nota = sc.nextInt();            
        }

        System.out.println("Nota inválida.");
        sc.close();
    }
    
    

}
