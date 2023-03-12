
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Prime prim = new Prime();
        prim.prime();
        System.out.println(" ");
        System.out.print("enter a number: ");
        int num = input.nextInt();
        prim.isPrime(num);
    }
}