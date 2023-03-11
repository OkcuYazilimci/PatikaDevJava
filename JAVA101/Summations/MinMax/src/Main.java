import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Operate op = new Operate();
        System.out.println("how many numbers will be compared? ");
        int u = input.nextInt();
        op.operate(u);
    }
}