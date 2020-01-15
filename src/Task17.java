import java.io.*;
//Запись данных в файл
public class Task17 {
    public static void main(String[] args) throws  IOException {
        String inputText;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст для записи в файл notes \nдля окончания записи введите слово 'стоп'");
        FileWriter writerToFile = new FileWriter("notes.txt");
        while (true) {
            System.out.print(": ");
            inputText = bufferRead.readLine();
            if (inputText.equals("стоп")) {
                break;
            }
            writerToFile.write(inputText + "\n");
        }
        bufferRead.close();
        writerToFile.close();
        System.out.println("Текст записан в файл notes.txt");
    }
}









