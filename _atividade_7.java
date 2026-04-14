package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Digite um número para saber se ele é múltiplo de 7 ou múltiplo de 11:");
        numb = sc.nextInt();

        if (numb % 7 == 0 || numb % 11 == 0) {
            System.out.println("Este número é múltiplo de 7 ou de 11.");
        }
        else {
            System.out.println("Este número não é múltiplo de 7 ou de 11.");
        }
    }
}
