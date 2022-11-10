import java.util.Scanner;

public class ModeCalculator {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        k = input.nextInt();

        int sum = 0, counter = 0;
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
    }
          }System.out.println(counter);
    }}