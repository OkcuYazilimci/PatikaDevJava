import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Polindrom word = new Polindrom();
        Scanner input = new Scanner(System.in);

        System.out.print("give the word please: ");
        String str = input.nextLine();
        word.isPolindrom(str);
    }
}
