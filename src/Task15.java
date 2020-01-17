import java.util.Scanner;
//Сортировка данных в массиве
public class Task15 {
    public static void main(String[] args) {
        Scanner scanInputInt = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayColumnsNum = scanInputInt.nextInt();
        int[] inputArray = new int[arrayColumnsNum];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < arrayColumnsNum; i++) {
            inputArray[i] = scanInputInt.nextInt();
        }
        for(int i = inputArray.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int n = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = n;
                }
            }
        }
        System.out.println("Элементы вашего массива, отсортированные метедом пузырька: ");
        for (int y = 0; y < arrayColumnsNum; y++) {
            System.out.print(inputArray[y] + " ");
        }
    }
}