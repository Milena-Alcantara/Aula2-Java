package Vetores;
import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {

            System.out.println("Informe um número  ");
            num[i] = scanner.nextInt();
        }
        System.out.println("Números Pares ");
        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {

                System.out.println(num[i]);

            }

        }
    }
}