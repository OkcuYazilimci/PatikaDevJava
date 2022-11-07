import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give your height(m): ");
        double height = input.nextDouble();
        System.out.println("Give your weight(kg): ");
        int weight = input.nextInt();
        double BMI = weight/(Math.pow(height,2));
        System.out.println("Your BMI is: "+BMI+"kg/m^2");
        if(25<BMI && BMI<30){
            System.out.println("you should lose some weight");}
        else if(BMI > 30){
                System.out.println("You should see a doctor");}
        else { System.out.println("You should gain some weight");}
            }
        }

