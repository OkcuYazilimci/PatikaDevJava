import java.util.Scanner;
public class PasswordMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        boolean isPasswordRigt = false;
// 3 deneme hakkı olsa nasıl olurdu düşün!!! YAPTIMMMM
        // daha basit bir yazımla bu yapılabilir miydi ??
        int denemeHakki = 3;
        while(! isPasswordRigt){
                    System.out.println("Enter password: ");
                    password = input.nextInt();
                        if(password == 123){
                            System.out.println("Correct password");
                            isPasswordRigt = true;
                            }
                        else {
                            denemeHakki -= 1;
                            System.out.println("Remaining try chance is "+denemeHakki);
                            if(denemeHakki == 0){System.out.println("Deneme hakkınız bitmiştir");
                                break;
                        }
}}}}


