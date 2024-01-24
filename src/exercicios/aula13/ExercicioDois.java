package aula13;

import java.util.Scanner;
public class ExercicioDois {

    public static void main(String[] args) {
        
        System.out.println("Informe um número: ");
        Scanner sc = new Scanner(System.in);
        int numeroInformado = sc.nextInt();
        
    
        System.out.println("O numero informado foi: " + numeroInformado);

        sc.close();
    }

}
