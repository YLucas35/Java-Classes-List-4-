import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        char letter = sc.next().charAt(0);

        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("Essa letra é vogal");
            }
            else {
                System.out.println("Essa letra é consoante");
            }
        }
    }
}
