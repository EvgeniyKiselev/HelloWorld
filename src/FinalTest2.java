import java.util.Arrays;
import java.util.Scanner;

///Написать программу сортировки по возрастанию заданного пользователем массива чисел.
///Пользователь программы должен задавать размер массива и наполнять его числами.
///Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

public class FinalTest2 {
    public static void main(String[] args) {
        Scanner scanInputInt = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int newArrayColumnsNum = scanInputInt.nextInt();
        int newArray[] = new int[newArrayColumnsNum];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < newArrayColumnsNum; i++) {
            newArray[i] = scanInputInt.nextInt();
        }
        for(int i = 0; i < newArray.length - 1; i++){
            if (newArray[i] > newArray[i + 1]) {
                int temp = newArray[i + 1];
                newArray[i + 1] = newArray[i];
                int j = i;
                while (j > 0 && temp < newArray[j - 1]) {
                    newArray[j] = newArray[j - 1];
                    j--;
                }
                newArray[j] = temp;
            }
        }
        System.out.println("Элементы массива отсортированные методом вставки " + Arrays.toString(newArray));
    }
}