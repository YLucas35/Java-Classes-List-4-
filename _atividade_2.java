package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb1, numb2, numb3;

        System.out.println("Digite o primeiro lado");
        numb1 = sc.nextDouble();

        System.out.println("Digite o segundo lado");
        numb2 = sc.nextDouble();

        System.out.println("Digite o terceiro lado");
        numb3 = sc.nextDouble();


        if ((numb1 + numb2 > numb3) && (numb1 + numb3 > numb2) && (numb2 + numb3 > numb1)) {
            System.out.println("Você consegue fazer um triângulo com a soma destes lados");
        }
        else {
            System.out.println("Você não consegue fazer um triângulo com a soma destes lados");
        }
    }
}
