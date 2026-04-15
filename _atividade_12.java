package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, pay, result;

        System.out.println("Digite o valor do produto:");
        valor = sc.nextDouble();

        System.out.println("Digite o número que indica o seu metódo de pagamento: (1 = vista; 2 = cartão; 3 = pagamento normal).");
        pay = sc.nextDouble();

        while (pay < 1 || pay > 3) {
            System.out.println("Metódo de pagamento inválido, tente outro.");
            System.out.println("Digite o número que indica o seu metódo de pagamento: (1 = vista; 2 = cartão; 3 = troco).");
            pay = sc.nextDouble();
        }

        if (pay == 1) {
            result = valor * 0.90;
            System.out.println("Parabéns! A sua compra tem um desconto de até 10%!! O valor final da sua compra então ficou como: "+result);
        }
        else if (pay == 2) {
            result = valor * 0.95;
            System.out.println("Parabéns! A sua compra tem um desconto de até 5%!! O valor final da sua compra então ficou como: "+result);
        }
        else {
            System.out.println("O valor final da sua compra foi: "+valor);
        }
        sc.close();
    }
}
