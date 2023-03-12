import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        Triangle pyramid = new Triangle();

        System.out.print("How many line there will be in the reverse pyramid: ");
        int line = input.nextInt();
        pyramid.triangle(line);
    }
}