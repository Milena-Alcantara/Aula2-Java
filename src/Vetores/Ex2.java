package Vetores;
// Faça um programa de lista de chamada que armazene o nome de
//10 alunos e apresente a lista completa para o usuário

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String al[] = new String[10];

        for (int i = 0; i < al.length; i++) {

            System.out.println("Digite o nome do aluno");
            al[i] = scanner.next();


        }

        System.out.println("Sua lista de chamada é: ");

        for (int i = 0; i < al.length; i++) {

            System.out.println(al[i]);

        }


    }
}
