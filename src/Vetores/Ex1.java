package Vetores;

 import java.util.Scanner;

 import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int vt[] = new int[5];


        for (int i = 0; i < vt.length; i++) {

            System.out.println("Informe um valor para  " + i);
            vt[i] = scanner.nextInt();
        }

        System.out.println("Valores digitados ");

        for (int i = 0; i < vt.length; i++) {

            System.out.println(vt[i]);

        }
        System.out.println("Soma");

        int res;

        res = vt[0] + vt[1] + vt[2] + vt[3] + vt[4];

        System.out.println("A soma dos seus valores: " + res);


    }
}
