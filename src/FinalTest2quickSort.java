import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalTest2quickSort {
    private static void quickSort(int[] newArray, int lowNum, int highNum) {
        if (newArray.length == 0) {
            return;
        }
        if (lowNum >= highNum) {
            return;
        }
        int middle = lowNum + (highNum - lowNum) / 2;
        int opora = newArray[middle];

        int i = lowNum, j = highNum;
        while (i <= j) {
            while (newArray[i] < opora) {
                i++;
            }
            while (newArray[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = newArray[i];
                newArray[i] = newArray[j];
                newArray[j] = temp;
                i++;
                j--;
            }
        }

        if (lowNum < j)
            quickSort(newArray, lowNum, j);
        if (highNum > i)
            quickSort(newArray, i, highNum);
    }
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanInputInt = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int newArrayColumnsNum = scanInputInt.nextInt();
        int[] newArray = new int[newArrayColumnsNum];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < newArrayColumnsNum; i++) {
            newArray[i] = scanInputInt.nextInt();
        }

        quickSort(newArray, 0, newArray.length - 1);
        System.out.println("Элементы массива отсортированные методом быстрой сортировки " + Arrays.toString(newArray));
    }

}