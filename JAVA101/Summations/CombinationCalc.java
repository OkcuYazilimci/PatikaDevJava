import java.util.Scanner;

public class CombinationCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nFactorial = 1, rFactorial = 1, nrFactorial = 1;
        System.out.println("Please enter the n value: ");
        int nValue = input.nextInt();
            for (int i = 1; i <= nValue; i++) {
                nFactorial *= i;
            }
       // System.out.println("N VALUE İS : " + nFactorial);
        System.out.println("Please enter the r value: ");
        int rValue = input.nextInt();
            for(int i = 1; i <= rValue ; i++){
                rFactorial *= i;
            }
            for (int i = 1; i <= (nValue-rValue) ; i++){
            nrFactorial *= i;
            }
        long combination = nFactorial / (rFactorial * nrFactorial);
        System.out.println("combination of "+nValue+" with "+rValue+" is "+combination);
    }
    // After factorial of 20 it calculates wrongly and its value become negative.
    // I do not understand why it is happening
    }
      /*    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
    sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r)
    şeklinde gösterilir.
          Java ile kombinasyon hesaplayan program yazınız.
          Kombinasyon formülü
          C(n,r) = n! / (r! * (n-r)!)     */