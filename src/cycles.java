import java.util.Scanner;
import java.util.Arrays;

public class cycles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int settedArraysLength = 5;  // В эту переменную назначается длина двух будущих массивов
        int sumOfArrayInts = 0;     // Инициализация переменной суммы чисел будущего массива, необходимой для ответа
        int[] array = new int[settedArraysLength];

        System.out.print("Введите первое число\n");

        if (sc.hasNextInt()) {                               // Если в консоль был введен Int, запускаем цикл
            for (int i = 0; i < settedArraysLength; i++) {
                array[i] = sc.nextInt();
                sumOfArrayInts += array[i];
                System.out.print(Arrays.toString(array) + "\n");

                if (i < settedArraysLength - 1) {                     // Если, введя очередной Int, мы не превысили длину массива
                    System.out.print("Введите следующее число\n");
                } else                                                // Если заполнили весь массив, выходим из цикла
                    break;
            }
        }

        for (int i = 0; i <= settedArraysLength-1; i++) {
                array[i] += array[i + 1];
                System.out.print(i);
                if (i == settedArraysLength - 1)
                    break;
            }
            System.out.printf(Arrays.toString(array));
        }
}


