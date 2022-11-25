import java.util.Scanner;
import java.lang.Math;

public class recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: \n");
        int userInt = sc.nextInt();
        System.out.print(squaredFactorial(userInt));
    }
    static double squaredFactorial(int a) {
    if(a == 1) {
        return 1;
    }
    return Math.sqrt(a) + Math.sqrt(squaredFactorial(a-1));
    }
}
