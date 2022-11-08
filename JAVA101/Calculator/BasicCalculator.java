import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give second number: ");
        int firstNum = input.nextInt();
        System.out.println("Give second number: ");
        int secondNum = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int Select = input.nextInt();

        switch (Select){
            case 1: System.out.println(firstNum+secondNum);
            break;
            case 2: System.out.println(firstNum-secondNum);
                break;
            case 3: System.out.println(firstNum*secondNum);
                break;
            case 4: System.out.println(firstNum/secondNum);
                break;
            default: System.out.println("Invalid operator");
        }
    }
}