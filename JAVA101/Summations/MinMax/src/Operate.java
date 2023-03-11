import java.util.Scanner;
import java.util.Arrays;
public class Operate {
    void operate(int a)
    {
        Scanner input = new Scanner(System.in);

        int[] ksort = new int[a];
        int i = 1;
        int w = 0;
        while (i <= a)
        {
            System.out.println(i +". değer: ");
            int b = input.nextInt();
            ksort[w] = b;
            i++;
            w++;
        }
        Arrays.sort(ksort);

        System.out.println("Smallest number is: " + ksort[0]);
        System.out.println("Biggest number is: " + ksort[w-1]);
    }
}
