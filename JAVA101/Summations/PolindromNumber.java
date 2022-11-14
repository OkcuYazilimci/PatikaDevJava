import java.util.Scanner;

public class PolindromNumber {

    static boolean IsPolindrom(int number){
        int temp = number , reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp%10;
            reverseNumber = reverseNumber*10 + lastNumber;
            temp /= 10;
        }
        if(reverseNumber==number){
            System.out.println(number+" is a polindrom number");
        }else {
            System.out.println(number+" is not a polindrom number");
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        IsPolindrom(input.nextInt());


        /// 654 % 10 = ( reverseNumber*10 )+4
        /// 654 / 10 = 65
        /// 65 % 10 = 5
        // 65 / 10 = 6
    }
}