package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, plus, square, firsttwo, lasttwo;
        System.out.println("Digite um número de 4 digitos:");
        numb = sc.nextInt();

        firsttwo = numb / 100;
        lasttwo = numb % 100;
        plus = firsttwo + lasttwo;
        square = plus * plus;

        while (numb < 1000 || numb > 9999) {
            System.out.println("Número inválido. Você precisa digitar um número de somente 4 digitos esqueceu?");
            System.out.println("Digite um número de 4 digitos:");
            numb = sc.nextInt();

            firsttwo = numb / 100;
            lasttwo = numb % 100;
            plus = firsttwo + lasttwo;
            square = plus * plus;
        }

        if (square == numb) {
            System.out.println("O número "+numb+" é um número mágico");
        }
        else {
            System.out.println("O número "+numb+" é um número normal");
        }
        sc.close();
    }
}
