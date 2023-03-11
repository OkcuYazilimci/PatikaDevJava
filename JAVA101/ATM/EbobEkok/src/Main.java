import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:  ");
        int number = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        int i = 2;
        boolean isTrue = false;
        //EKOK
        while ((i < (number/2)) || (i < (number2/2))) {
            if ((number % i == 0) && (number2 % i == 0)) {
                isTrue = true;
                break;
            }
            i++;
        }
        if (isTrue)
        {
            System.out.println("EKOK is " + i);
        }
        else
        {
            System.out.println("they dont have any common multiple");
        }
        int y;
        boolean isTrue2 = false;
        y = Math.min(number, number2);
        //EBOB
        while (y > 0)
        {
            if ((number % y == 0) && (number2 % y == 0))
            {
                isTrue2 = true;
                break;
            }
            y--;
        }
        if (isTrue2)
        {
            System.out.println("EBOB is " + y);
        }
        else
            System.out.println("There is no common ebob");
    }
}