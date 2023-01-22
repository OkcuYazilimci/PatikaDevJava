public class Passenger {
    private String name;
    private int distance;
    private int age;
    private String type;


    public Passenger(String name,int distance, int age, String type) {
        this.name = name;
        this.distance = distance;
        this.age = age;
        this.type = type;
    }


    public String getName(){
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public void totalprice(int distance, String type) {
        if (type.equals("round trip")) {
            double price = 0.20*this.distance;
        }
        else{ System.out.println("Total price without discount is: " + 0.10*this.distance);
        }
    }
    double price() {
        if (type.equals("round trip")) {
            return 0.20*this.distance;
        }
        else{
            return 0.10*this.distance;
        }
    }
    public void discount() {
        if(type.equals("round trip")  || type.equals("r") || type.equals("1")){
        if(this.age < 12) {
            System.out.println("Passenger "+ this.name + " the total price with discount: " +(price()*0.5)*0.8+ " TL" );
        }
        else if(12 < this.age && this.age < 24) {
            System.out.println("Passenger "+ this.name +" the total price with discount: " +(price()*0.9)*0.8 + " TL");
        }
        else if(this.age > 65) {
            System.out.println("Passenger "+ this.name +" the total price with discount: " +(price()*0.7)*0.8 + " TL");
        }
        else{  System.out.println("Passenger "+ this.name +" the total price with discount: " +(price())*0.8+ " TL");}
    }

        else if(type.equals("Single trip") || type.equals("s") || type.equals("2")){
            if(this.age < 12) {
            System.out.println("Passenger "+ this.name +" the total price with discount: " + (price()*0.5)+ " TL" );
        }
        else if(12 < this.age && this.age < 24) {
            System.out.println("Passenger "+ this.name +" the total price with discount: " +(price()*0.9) + " TL");
        }
        else if(this.age > 65) {
            System.out.println("Passenger "+ this.name +" the total price with discount: " +(price()*0.7) + " TL");
        }
        else{  System.out.println("Passenger "+ this.name +" the total price with discount: " +(price())+ " TL");}
        }

        else{
            System.out.println("You have entered invalid values!!!");
        }

    }
}
