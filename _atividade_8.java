package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso ideal (parabéns!)");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Levemente acima do peso (Sobrepeso)");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else {
            System.out.println("Classificação: Obesidade Grau II ou Obesideade Grau III");
        }
        sc.close();
    }
}
