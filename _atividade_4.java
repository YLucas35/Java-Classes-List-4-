package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual é a sua idade, nadador?");
        idade = sc.nextInt();

        while (idade == 0 || idade > 120) {
            System.out.println("Idade inválida, digite outra.");
            idade = sc.nextInt();
        }

        String nadador = (idade <= 7) ? "Você é um nadador muito infantil (criança)." : (idade <= 17) ? "Você é um nadador juvenil." : "Você é um nadador sênior";

        System.out.println(nadador);
    }
}
