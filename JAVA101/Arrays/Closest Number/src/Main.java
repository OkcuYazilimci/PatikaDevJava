import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,99,23,65,151,-12,222,8,12200};
        int small = Integer.MIN_VALUE;
        int big = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number please: " );
        int number = input.nextInt();
            for(int i: list){
                if(i<number){
                    if (i>small){small = i;}

                }else if (i>number){
                    if(i<big){
                        big = i;
                    }
                }
            }
        System.out.println("The greatest number smaller than the number you entered : "+small);
        System.out.println("The smallest number greater than the number you entered : "+big);

    }
}