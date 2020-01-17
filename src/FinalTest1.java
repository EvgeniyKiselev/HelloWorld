import java.io.*;
import java.util.InputMismatchException;

///Итоговая задача №1:
///Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
/// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

public class FinalTest1 {
    public static void main(String[] args) throws IOException {
        String binaryNumStr = correctInputString();
        binaryConvertToDecimal(binaryNumStr);
        System.out.println(binaryNumStr + " В десятичной системе = " + binaryConvertToDecimal(binaryNumStr));
    }

    private static String correctInputString() throws IOException {
        System.out.println("Введите число в двоичной системе: ");

        boolean check = false;
        String binaryNumStr = null;

        while (!check) {
            binaryNumStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
            check = checkString(binaryNumStr);

            if (!check) {
                System.out.println("Некорректный ввод, введите число в двоичной системе: ");
            }
        }

        return binaryNumStr;
    }

    private static int binaryConvertToDecimal(String binaryNumStr) {
        int binaryToDecimal = 0;

        try {
            for (int j = 0; j < binaryNumStr.length(); j++) {
                binaryToDecimal <<= 1;

                if (binaryNumStr.charAt(j) == '1') {
                    binaryToDecimal++;
                }
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Это не число" + ex);
        }

        return binaryToDecimal;
    }

    private static boolean checkString(String writeFromConsoleString) {
        if (writeFromConsoleString.isEmpty() || writeFromConsoleString.contains(" ")) {
            return false;
        }

        for (int i = 0; i < writeFromConsoleString.length(); i++) {
            char c = writeFromConsoleString.charAt(i);

            if (c != '0' && c != '1') {
                return false;
            }
        }

        return true;
    }
}
