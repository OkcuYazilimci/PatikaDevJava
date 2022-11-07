import java.util.Scanner;
public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first side: ");
        double a = input.nextDouble();
        System.out.println("Give the second side: ");
        double b = input.nextDouble();
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse is equals to: "+hypotenuse);
        System.out.println("Perimeter of triangle equals to: "+(a+b+hypotenuse));
     }
}
 
