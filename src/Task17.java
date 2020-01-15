import java.io.*;
//Запись данных в файл
public class Task17 {
    public static void main(String[] args) throws  IOException {
        String iText;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст для записи в файл notes \nдля окончания записи введите слово 'стоп'");
        FileWriter writer = new FileWriter("notes.txt");
        while (true) {
                System.out.print(": ");
                iText = br.readLine();
                if (iText.equals("стоп"))
                 {
                   break;
                   }
                 writer.write(iText + "\n");
        }
        br.close();
        writer.close();
        System.out.println("Текст записан в файл notes.txt");
    }
}









