import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
С клавиатуры вводится количество элементов массива, заполняется
случайно сгенерированными числами, распечатывается массив, длиная массива,
количество чисел больше 8, количество чисел равных 1, количество четных чисел,
количество нечетных чисел, сумма всех элементов массива.
 */
public class Main {
    public static void main(String[] args) {
        int arrayLenghts = arrayLengs();
        int[] array = array(arrayLenghts);
        printArray(array);
        printNumMore(array, 8);
        printNumEqual(array, 1);
        printOddEven(array);
        printSumm(array);
    }

    // Определение длины массива
    public static int arrayLengs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        return scanner.nextInt();
    }

    //Генерация массива
    public static int[] array(int arrayLengs) {
        Random random = new Random();
        int[] array = new int[arrayLengs];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    // Печать массива в консоль
    public static void printArray(int[] array) {
        System.out.println("Сгенерирован массив случайных чисел длинной " + array.length + " элементов");
        System.out.println(Arrays.toString(array));
    }

    // Определение чисел больше заданного
    public static void printNumMore(int[] array, int num) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                sum++;
            }
        }
        System.out.println("Количество чисел больше " + num + " равно " + sum);
    }

    // Определение чисел раных заданному
    public static void printNumEqual(int[] array, int num) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                sum++;
            }
        }
        System.out.println("Количество чисел равных " + num + " равно " + sum);
    }

    // Определение ченых и нечетных чисел
    public static void printOddEven(int[] array){
        int sumOdd = 0;
        int sumEven =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {sumOdd++;}
            else sumEven++;
        }
        System.out.println("Количество четных чисел равно " + sumEven);
        System.out.println("Количество нечетных чисел равно " + sumOdd);
    }

    // Определение чисел массива
    public static void printSumm(int[] array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма чисел массива равна " + sum);
    }


}