import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Plus plus = new Plus();

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        plus.number(number);
    }
}