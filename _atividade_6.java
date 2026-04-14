package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean math = true;

        while (math) {
            System.out.print("Caso queira fazer um cálculo digite 'c' para calcular ou caso vc não queira calcular digite 's' para sair: ");
            char opcao = sc.next().charAt(0);

            if (opcao == 's' || opcao == 'S') {
                math = false;
                System.out.println("Encerrando a calculadora...");
            } else if (opcao == 'c' || opcao == 'C') {

                System.out.print("Digite o primeiro número: ");
                double numb1 = sc.nextDouble();

                System.out.print("Digite a operação (+, -, x, :): ");
                char calc = sc.next().charAt(0);

                System.out.print("Digite o segundo número: ");
                double numb2 = sc.nextDouble();

                double result;

                if (calc == '+') {
                    result = numb1 + numb2;
                    System.out.printf("Resultado: %.0f%n", result);
                } else if (calc == '-') {
                    result = numb1 - numb2;
                    System.out.printf("Resultado: %.0f%n", result);
                } else if (calc == 'x') {
                    result = numb1 * numb2;
                    System.out.printf("Resultado: %.0f%n", result);
                } else if (calc == ':') {
                    if (numb2 != 0) {
                        result = numb1 / numb2;
                        System.out.println("Resultado: " + result);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitido.");
                    }
                } else {
                    System.out.println("Operação inválida! Tente novamente");
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
