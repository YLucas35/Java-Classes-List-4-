package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Digite um número:");
        numb = sc.nextInt();

        if (numb >= 100) {
            String valor = (numb % 2 == 0) ? "Seu número é par e maior do que 100 (ou igual a 100)" : "Seu número é ímpar e maior do que 100 (ou igual a 100)";
            System.out.println(valor);
        }
        else {
            String valor = (numb % 2 == 0) ? "Seu número é par e menor do que 100" : "Seu número é ímpar e menor do que 100";
            System.out.println(valor);
        }
    }
}
