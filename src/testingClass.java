import java.util.Scanner;

public class testingClass {

    public static void main(String[] args) {

        int bet = 7; // in percents
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите размер вклада: \n");
        int userDeposit = scanner.nextInt();
        System.out.print("Введите срок вложения в годах: \n");
        int userTime = scanner.nextInt();

        for(int i = 1; i<=userTime; i++) {
            userDeposit += (userDeposit / 100 * bet) * i;
        }
        System.out.printf("Cумма вашего вклада составит: %d ", userDeposit);
    }
}
