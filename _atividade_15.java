package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, limit;

        limit = 31;

        System.out.println("Digite o número do mês de seu nascimento:");
        month = sc.nextInt();

        while (month < 1 || month > 12) {
            System.out.println("Mês de nascimento inválido, tente outro.");
            System.out.println("Digite o número do mês de seu nascimento:");
            month = sc.nextInt();
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            limit = 30;
        } else if (month == 2) {
            limit = 29;
        }

        System.out.println("Digite o número do dia de seu nascimento:");
        day = sc.nextInt();

        while (day < 1 || day > limit) {
            limit = 31;
            System.out.println("Para o mês "+month+", o dia deve ser entre 1 e "+limit);
            System.out.println("Mês de nascimento inválido, tente outro.");
            System.out.println("Digite o número do mês de seu nascimento:");
            month = sc.nextInt();
        }

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println("Prabens! Você é do signo de Áries!!");
        }
        else {
            System.out.println("Você não é do signo de Áries.");
        }
        sc.close();
    }
}
