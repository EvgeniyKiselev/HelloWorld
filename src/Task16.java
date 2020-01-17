import java.io.*;

//Выгрузка данных из файла на экран

public class Task16 {
    public static void main(String[] args) {
        try (BufferedReader bufferRead = new BufferedReader(new FileReader("notes.txt")))
        {
            for (String stringFromFile = bufferRead.readLine(); stringFromFile != null; stringFromFile = bufferRead.readLine()) {
                System.out.println(stringFromFile);
            }
        } catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}