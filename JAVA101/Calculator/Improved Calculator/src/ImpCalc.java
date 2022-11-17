import java.util.Scanner;

public class ImpCalc {
    static void calculate(float x,float y){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - summation 2 - subtruction \n3 - Rectangle area 4 - Power operation " +
                "\n5 - mode operation  6 - factorial operation ");
        int menu = input.nextInt();
        switch (menu){
            case 1 :
                System.out.println(x+y);
                break;
            case 2 :
                System.out.println(x-y);
                break;
            case 3 :
                System.out.println(x*y);
                break;
            case 4 :
                System.out.println(Math.pow(x,y));
                break;
            case 5 :
                System.out.println(x%y);
                break;
            case 6:
                int fact = 1;
                for(int i = 1 ; i <= x ; i++)
                {fact *= i;}
                int fact2 = 1; //Burda iki tane ayrı yazmamak için ne yapmak gerekirdi düşün...
                for(int i = 1 ; i <= y ; i++)
                    fact2 *= i;
                System.out.println(fact+" , "+fact2);
                break;
            default: System.out.println("İnvalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give two value for operation: ");
        int x = input.nextInt();
        int y = input.nextInt();
    calculate(x,y);

    }
}