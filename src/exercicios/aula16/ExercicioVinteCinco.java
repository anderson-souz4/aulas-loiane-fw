package exercicios;

import java.util.Scanner;

public class ExercicioVinteCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contadorSim = 0;
        int contadorNao = 0;
        char resposta;
        
        System.out.println("Responda com S pra sim e N para não.");
        System.out.println("Telefonou para a vítima?");
        resposta = sc.next().charAt(0);
        if (resposta == 's') {
            contadorSim++;    
        } else {
            contadorNao++;
        }
        System.out.println("Esteve no local do crime?");
        resposta = sc.next().charAt(0);
        if (resposta == 's') {
            contadorSim++;    
        } else {
            contadorNao++;
        }        
        System.out.println("Mora perto da vítima?");
        resposta = sc.next().charAt(0);
        if (resposta == 's') {
            contadorSim++;    
        } else {
            contadorNao++;
        }
        System.out.println("Devia para a vítima?");
        resposta = sc.next().charAt(0);
        if (resposta == 's') {
            contadorSim++;    
        } else {
            contadorNao++;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = sc.next().charAt(0);
        if (resposta == 's') {
            contadorSim++;    
        } else {
            contadorNao++;
        }
        
        if (contadorSim == 2) {
            System.out.println("Suspeito");
        }else if (contadorSim > 2 && contadorSim <= 4) {
            System.out.println("Cumplice");
        } else if (contadorSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        sc.close();

    }

}
