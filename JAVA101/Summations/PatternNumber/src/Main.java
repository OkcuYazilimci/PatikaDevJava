import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Pattern pat = new Pattern();

        System.out.print("give number to create a pattern: ");
        int number = input.nextInt();
        int temp =  number;

        pat.desen1(number,temp);

    }
}