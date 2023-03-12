import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibonacci fibo = new Fibonacci();

        System.out.println("which index value: ");
        int index = input.nextInt();
        System.out.println(index + ". index value is: " + fibo.fib(index));
    }
}