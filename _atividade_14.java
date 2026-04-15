package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment, result;

        System.out.println("Qual é o seu salário?");
        payment = sc.nextDouble();

        if (payment <= 2000) {
            System.out.println("O valor do imposto a ser pago é R$0,00");
        }
        else if (payment <= 5000) {
            result = payment * 0.10;
            System.out.printf("O valor do imposto a ser pago é R$%.2f%n", result);
        }
        else {
            result = payment * 0.20;
            System.out.printf("O valor do imposto a ser pago é R$%.2f%n", result);
        }
    }
}
