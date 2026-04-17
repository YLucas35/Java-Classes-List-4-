package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Digite um número:");
        numb = sc.nextInt();

        if (numb % 2 == 0 && numb % 3 == 0 && numb % 5 == 0) {
            System.out.println("Este número é divisível por 2, por 3 e por 5");
        }
        else {
            System.out.println("Este número não é divisível por 2, por 3 e por 5");
        }
        sc.close();
    }
}
