import java.util.Random;
import java.util.Scanner;
public class MainOne {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        kub(rounds);
    }
    public static void kub(int rounds) {
        int player1 = 0;
        int player2 = 0;
        int draw = 0;
        Random random = new Random();

        for (int i = 1; i <= rounds; i++) {
            int player1Roll = random.nextInt(6) + 1;
            int player2Roll = random.nextInt(6) + 1;

            String result;
            if (player1Roll > player2Roll) {
                player1++;
                result = "Игрок 1 выигрывает";
            } else if (player2Roll > player1Roll) {
                player2++;
                result = "Игрок 2 выигрывает";
            } else {
                draw++;
                result = "Ничья";
            }


            System.out.printf("Раунд %d: %s (Игрок 1: %d, Игрок 2: %d)\n", i, result, player1Roll, player2Roll);
        }

        System.out.println("\nИтоги игры:");
        System.out.printf("Игрок 1 побед: %d\n", player1);
        System.out.printf("Игрок 2 побед: %d\n", player2);
        System.out.printf("Ничьи: %d\n", draw);
    }
}

