import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the power value: ");
        int powValue = input.nextInt();
        int total = 1;
            for(int i = 1 ; i <= powValue;i++){
                total *= number;
            }
             System.out.println(total);
    }
}