import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    Passenger p1 = new Passenger("Sahra NURCAN",1200,15,"round trip");
    Passenger p2 = new Passenger("Kadir OLGUN",1200,15,"Single trip");
    Passenger p3 = new Passenger("Umut UYGUN",3000,22,"Single trip");
    Passenger p4 = new Passenger("Bekir UYGUN",3000,69,"round trip");
    Passenger p5 = new Passenger("Cenk CENK",1222,44,"G");
    p1.discount();
    p2.discount();
    p3.discount();
    p4.discount();
    p5.discount();




    }
}