package Vetores;
import  java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Banda;
        String msc[] = new String[3];

        System.out.println("Digite o nome da banda: ");
        Banda = scanner.nextLine();

        for (int i = 0; i <msc.length ; i++) {

            System.out.println("Informe o nome das múscias da " + Banda);
            msc[i] = scanner.nextLine();



        }
        for (int i = 0; i < msc.length; i++) {

            System.out.println(Banda);
            System.out.println(msc[i]);

        }



    }
}
