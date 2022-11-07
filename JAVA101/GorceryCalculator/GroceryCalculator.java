import java.util.Scanner;

public class GroceryCalculator {
    public static void main(String[] args) {
        double toplam,armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input = new Scanner(System.in);
        System.out.println("kaç kilogram armut aldınız?: ");
        armutKg = input.nextDouble();
        System.out.println("kaç kilogram elma aldınız?: ");
        elmaKg = input.nextDouble();
        System.out.println("kaç kilogram domates aldınız?: ");
        domatesKg = input.nextDouble();
        System.out.println("kaç kilogram muz aldınız?: ");
        muzKg = input.nextDouble();
        System.out.println("kaç kilogram patlıcan aldınız?: ");
        patlicanKg = input.nextDouble();

        toplam= (2.14*armutKg)+(3.67*elmaKg)+(1.11*domatesKg)+(muzKg*0.95)+(5.00*patlicanKg);
        System.out.println("Toplam tutar:  "+toplam+"TL");



    }
}