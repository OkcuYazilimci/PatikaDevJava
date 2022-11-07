import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, area, perimeter ;
        System.out.println("Give the radius: ");
        r = input.nextDouble();
        area = Math.PI * ((r * r )/4);
        perimeter = 2*Math.PI*(r/2);
        System.out.println("Area of Circle is: "+ area +"\n"+"Perimeter of the circle is: "+perimeter);
    }
}