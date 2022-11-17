import java.util.Scanner;

public class RecursivePower {
    static int power(int n,int m) {
        if (m > 0) {
            return n * power(n, m - 1);
        } else {return 1;}
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 1;
        do{
            System.out.println("Give the main value: ");
            int n = input.nextInt();
            System.out.println("Give the power value: ");
            int m = input.nextInt();
            System.out.println(power(n,m));
            System.out.println("Do you want to continue: 1- Yes  2-No ");
            cont = input.nextInt();
        }
        while (cont != 2);
    }
}