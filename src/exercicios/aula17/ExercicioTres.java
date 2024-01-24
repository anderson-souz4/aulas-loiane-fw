package exercicios;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
        int validacao = 0;

        do {
        System.out.println("Informe seu nome: ");
        nome = sc.next();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        System.out.println("Informe seu salário: ");
        salario = sc.nextDouble();
        System.out.println("Informe seu sexo: ");
        sexo = sc.next().charAt(0);
        System.out.println("Estado civil: ");
        estadoCivil = sc.next().charAt(0);

        if (nome.length() < 3) {
            System.out.println("Quantidade de caracteres inválidos para o campo nome.");
            validacao++;
        }
        if (idade < 0 && idade > 150) {
            System.out.println("Idade não permitida.");
            validacao++;
        }

        if (salario < 0) {
            System.out.println("Salário tem que ser maior que 0.");
            validacao++;
        }
        if (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
            System.out.println("Sexo inválido.");
            validacao++;
        }
        
        
        }while(validacao != 0);

        sc.close();

    }
}
