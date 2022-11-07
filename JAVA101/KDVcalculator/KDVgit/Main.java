import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Gİve the whole amount: ");
        double wholeAmount = input.nextDouble();
        System.out.println("Give the KDV rate (%): ");
        Double KDV = input.nextDouble();
        double convert = KDV/100;
        double withKDV = wholeAmount + (convert*wholeAmount);
        System.out.println("Price without KDV: "+wholeAmount);
        System.out.println("Price with KDV: "+ withKDV);
        System.out.println("KDV rate is: %"+KDV);
 
    }
}
