import java.util.Scanner;

//Отработка поразрядных операций

public class BinaryNum {
    public static void main(String[] args) {

        /// получение данных

        Scanner inputBinaryNum = new Scanner(System.in);
        System.out.println("Введите число в двоичной системе: ");
        String binaryNum = inputBinaryNum.nextLine();

        /// конвертация

        int binToDecimalNum = Integer.parseInt(binaryNum, 2);
        System.out.println(binToDecimalNum);
    }
}


