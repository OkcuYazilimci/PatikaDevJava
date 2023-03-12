import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sort s = new Sort();

        System.out.print("Index number of the array: ");
        int num = input.nextInt();
        s.sort(num);
    }
}