package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Digite um número:");
        numb = sc.nextInt();

        if (numb >= 100 && numb <= 200) {
            System.out.println("Seu número está entre 100 e 200");
        }
        else {
            String valor = (numb >= 200) ? "Seu número é maior do que o intervalo determinado pelo programa." : "Seu número é menor do que o intervalo determinado pelo programa.";
            System.out.println(valor);
        }
    }
}
