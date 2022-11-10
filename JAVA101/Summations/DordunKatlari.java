import java.util.Scanner;

public class DordunKatlari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isitEven = true;
        int veri ;
        int sum = 0;

        while(isitEven){
            System.out.println("Please enter a number: ");
            veri = input.nextInt();
            if (veri%2==0){
                sum += veri;
                isitEven = true;
            }
                else { System.out.println("final summation of the numbers is: "+sum);

                    break;}
        }
    }
}