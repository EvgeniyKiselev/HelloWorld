import java.util.Arrays;
import java.util.Scanner;

///Написать программу сортировки по возрастанию заданного пользователем массива чисел.
///Пользователь программы должен задавать размер массива и наполнять его числами.
///Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
//------------------------------TODO-------------------------------
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
        System.out.println(Arrays.toString(newArray));
    //   System.out.println("Элементы вашего массива, ;?**?%: ");
    //   for (int y = 0; y < newArrayColumnsNum; y++) {
    //       System.out.println(newArray[y]);
     //   }
    }
}