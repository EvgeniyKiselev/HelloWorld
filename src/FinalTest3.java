import java.util.InputMismatchException;
import java.util.Scanner;

///Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
///Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
///(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

public class FinalTest3 {
    private static double separatorCheck(String inputUsdRate) {
        if (inputUsdRate.contains(",")) {
            inputUsdRate = inputUsdRate.replace(",", ".");
        }
        return Double.parseDouble(inputUsdRate);
    }
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanInputString = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        String inputUsdRate = scanInputString.nextLine();
        System.out.println("Введите сумму в рублях: ");
        String inputRurForConvert = scanInputString.nextLine();

        System.out.println("Итого: " + String.format("%.2f", separatorCheck(inputRurForConvert) / separatorCheck(inputUsdRate)) + " долларов");
    }
}
