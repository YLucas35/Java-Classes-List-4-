package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numb1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double numb2 = sc.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numb3 = sc.nextDouble();

        double maior = numb1;

        if (numb2 > maior) {
            maior = numb2;
        }
        if (numb3 > maior) {
            maior = numb3;
        }

        System.out.printf("O maior número é: %.0f%n", maior);
    }
}
