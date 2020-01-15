import java.io.*;
import java.util.InputMismatchException;
//Итоговая задача №1:
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
public class FinalTest1<CheckString> {
    public static void main(String[] args) throws IOException {
        BufferedReader inputString = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в двоичной системе: ");
        String binaryNumStr = inputString.readLine();
        //проверка корректности введенных данных
        boolean check = checkString(binaryNumStr);
        while (!check) {
            System.out.println("Некорректный ввод, введите число в двоичной системе: ");
            inputString = new BufferedReader(new InputStreamReader(System.in));
            binaryNumStr = inputString.readLine();
            check = checkString(binaryNumStr);
        }
        inputString.close();
        //перевод в двоичную систему
        int n = 0;
        try {
            for (int j = 0; j < binaryNumStr.length(); j++) {
                n <<= 1;
                if (binaryNumStr.charAt(j) == '1') n++;
            }
            System.out.println(n);
        } catch (InputMismatchException ex) {System.out.println("Это не число" + ex);
        } finally {
            inputString.close();
        }
    }

    public static boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '1')) {
                return false;
            }
        }
        return true;
    }

}
