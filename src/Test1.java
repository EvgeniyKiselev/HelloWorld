import java.util.Random;

public class Test1

{

    public static void main(String args[])

    {
        final Random random = new Random();
        String result = "";

        for(int i = 0; i < 10; i++){
           // Random myRandom = null;
            result += String.valueOf(random.nextInt()) + "\n";
        }

        System.out.println(result);

    }

}