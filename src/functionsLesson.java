import java.util.Scanner;
import java.util.Arrays;

public class functionsLesson {

    public static void main(String[] args) {
        System.out.print("Введите первое число: \n");

        //scanConsoleAndMakeArray();
        sumPairsInArray(scanConsoleAndMakeArray());
    }

/*Эта функция поочередно берет вводимые в консоль int-ы и запихивает их также поочередно в массив для дальнейшей передачи
в функцию sumPairsInArray. Но вот беда: в цикле массив заполняется, как и задумано, а после цикла он остается забитым
нулями, как при его инициализации до цикла.*/
    static int[] scanConsoleAndMakeArray() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
            if (sc.hasNextInt()) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = sc.nextInt();
                    System.out.print(Arrays.toString(array) + "\n");

                    if (i < array.length - 1) {
                        System.out.print("Введите следующее число: \n");
                    }
                }
            }
            sc.close();
            return array;
    }

/*Эта функция будет брать уже заполненный массив из scanConsoleAndMakeArray и складывать соседние пары чисел массива,
однако на данный момент она */
        static void sumPairsInArray(int[] array) {
            for(int i = 0; i < array.length; i++) {
                array[i] +=array[i+1];
                if(i == array.length - 2) {
                    array[array.length - 1] += array[0];
                    break;
                }
            }

            //array = scanConsoleAndMakeArray();
            System.out.print("Получившийся массив: " + Arrays.toString(array));
        }
}

