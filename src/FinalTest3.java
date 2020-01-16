import java.util.InputMismatchException;
import java.util.Scanner;

///Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
///Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
///(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

public class FinalTest3 {
    public static double separatorCheck(String inputUsdRate) {
        String separatedInputUsdRate = null;
        if (inputUsdRate.contains(",")) {
            separatedInputUsdRate = inputUsdRate.replace(",", ".");
        }
        else {
            separatedInputUsdRate = inputUsdRate;
        }
        return Double.parseDouble(separatedInputUsdRate);
    }
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanInputString = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        String inputUsdRate = scanInputString.nextLine();
        System.out.println("Введите сумму в рублях: ");
        String inputRurForConvert = scanInputString.nextLine();

        double usdRate = 0;
        double rurForConvert = 0;
        usdRate =  separatorCheck(inputUsdRate);
        rurForConvert = separatorCheck(inputRurForConvert);
        System.out.println("Итого: " + String.format("%.2f", rurForConvert / usdRate) + " долларов");
    }
}
