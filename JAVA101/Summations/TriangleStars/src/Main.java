import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i;
        int u;
        System.out.println("please give a number");
        u = input.nextInt();
        i = 0;
        while (i < u)
        {
            int j = 0;
            while (j < (u - i))
            {
                System.out.print(" ");
                j++;
            }
            for(int k = 1; k <= (2*i + 1); k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }
        while(i >= 0)
        {
            for(int a = 0; a < (u - i); a++)
            {
                System.out.print(" ");
            }
            int n = 0;
            while (n < (2*i + 1))
            {
                System.out.print("*");
                n++;
            }
            System.out.println(" ");
            i--;
        }
    }
}
