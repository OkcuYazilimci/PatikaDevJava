package Entities;

public class Phone extends Products{

    private int battery;

    public Phone() {

    }
    public Phone(String brand, String name,
                 double price, int discount, int stock,
                 int ram, int memory, double screenDim,int battery, String color) {
        super(brand, name, price, discount, stock, ram, memory, screenDim, color);
        this.battery = battery;
    }
    // GETER SETTER
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
