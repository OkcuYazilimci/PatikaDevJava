
import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    Calculate cal = new Calculate();

    System.out.print("Please enter a number: ");
    int number = input.nextInt();

    cal.calc(number);
    }
}