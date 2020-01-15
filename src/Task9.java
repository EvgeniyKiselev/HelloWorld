import java.util.Scanner;

//Ввод/вывод данных для массива

public class Task9 {
    public static void main(String[] args) {
        Scanner scanInputInt = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int newArrayColumnsNum = scanInputInt.nextInt();
        int newArray[] = new int[newArrayColumnsNum];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < newArrayColumnsNum; i++) {
            newArray[i] = scanInputInt.nextInt();
        }

        System.out.println("Элементы вашего массива, умноженные на 2: ");
        for (int y = 0; y < newArrayColumnsNum; y++) {
            System.out.println(newArray[y] * 2);
        }
    }
}
