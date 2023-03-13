import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Guess {
    void guess()
    {
        System.out.println("Welcome the guess the number game!");
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int numRan = rand.nextInt(100);
        int i, right;

        i = 0;
        right = 5;
        int[] arr = new int[right];

        while(right > 0)
        {
            System.out.print( "Remaining guess right "+ right +" Guess the number between 0 - 100: ");
            int number = input.nextInt();
            arr[i] = number;
            if(number >= 0 && number <= 100) {
                if (number > numRan) {
                    System.out.println("The number u have chosen is bigger than the value ");
                } else if (number < numRan) {
                    System.out.println("The number u have chosen is smaller than the value ");
                } else {
                    System.out.println("Congratulations u have chosen the right value");
                    break;
                }
            }
            else
            {
                System.out.println("The number you choose is out of range. Try again");
                right++;
            }
            i++;
            right--;
        }
            if (right == 0)
            {
                System.out.println("U HAVE LOST");
                System.out.println("Correct answer was: " + numRan);
            }

            System.out.println("Numbers u choose" + Arrays.toString(arr));
            System.out.println("The game is finished!");
    }
}
