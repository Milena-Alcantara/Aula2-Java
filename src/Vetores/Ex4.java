package Vetores;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qitens;

        System.out.println("Quantos intens você vai comprar? ");
        qitens = scanner.nextInt();

        String itens[] = new String[qitens];

        for (int i = 0; i < itens.length; i++) {

            System.out.println("Informe o produto: ");
            itens[i] = scanner.next();

        }
        System.out.println("Sua lista de compras é: ");
        for (int i = 0; i < itens.length; i++) {

            System.out.println(itens[i]);
        }






    }
}
