package exercicios;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Informe seu usuario: ");
        usuario = sc.nextLine();
        System.out.println("Informe sua senha: ");
        senha = sc.nextLine();

        do{
            System.out.println("A senha não pode ser a mesma que o login.");
            System.out.println("Informe seu usuario: ");
            usuario = sc.nextLine();
            System.out.println("Informe sua senha: ");
            senha = sc.nextLine();
        }while (senha == usuario);

        System.out.println("usuario logado com sucesso.");

        sc.close();
    }

}
