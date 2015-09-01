import java.util.Random;
public class RandomGenerator
{
    public static void main(String[]args)
    {
        Random randomNumber = new Random();
        System.out.println(randomNumber.nextInt(6));
    }
}
