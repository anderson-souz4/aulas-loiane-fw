package exercicios;

import java.util.Scanner;

public class ExercicioVinteDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int numeroInformado = sc.nextInt();
        
        if (numeroInformado % 2 == 0) {
            System.out.println("Numero par");            
        }else {
            System.out.println("Numero ímpar");
        }
        
        

        sc.close();

    }

}
