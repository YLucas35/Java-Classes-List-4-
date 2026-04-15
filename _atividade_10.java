package Java_Lista_4_Revisao;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time1, time2, result;
        System.out.println("Digite a hora em que o jogo começou: (eu leio números em horas)");
        time1 = sc.nextInt();

        while (time1 < 0 || time1 > 23) {
            System.out.println("Esse tempo (em horas) não existe, tente novamente.");
            System.out.println("Digite a hora em que o jogo começou: (eu leio números em horas)");
            time1 = sc.nextInt();
        }

        System.out.println("Digite a hora de quando o jogo encerrou (eu leio números em horas, não se esqueça!)");
        time2 = sc.nextInt();

        while (time2 < 0 || time2 > 23) {
            System.out.println("Esse tempo (em horas) não existe, tente novamente.");
            System.out.println("Digite o tempo de encerro do jogo");
            time2 = sc.nextInt();
        }

        if (time2 <= time1) {
            result = (24 - time1) + time2;
            System.out.println("O jogo acabou no dia seguinte e a duração total do jogo foi: "+result+" horas");
        }
        else {
            result = time2 - time1;
            System.out.println("O jogo já acabou e a duração total do jogo foi: "+result+" horas");
        }
        sc.close();
    }
}
