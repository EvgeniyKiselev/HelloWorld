import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input name: ");
        String name = in.nextLine();
        System.out.println("age ? ");
        int age = in.nextInt();
        System.out.print("ves? ");
        float ves = in.nextFloat();
        System.out.printf("Name: %s \n Age = %d \n Height: %.2f \n", name, age, ves);
        System.out.print("line");

    }
}