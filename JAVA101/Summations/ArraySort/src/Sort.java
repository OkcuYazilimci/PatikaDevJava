import java.util.Scanner;
import java.util.Arrays;
public class Sort {

    void sort(int a)
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[a];
        int b = 1;
        while(i < a)
        {
            System.out.print(b + ". Eleman: ");
            int number = input.nextInt();
            arr[i] = number;
            i++;
            b++;
        }
        Arrays.sort(arr);

        System.out.print("Sıralama" + Arrays.toString(arr));
    }
}
