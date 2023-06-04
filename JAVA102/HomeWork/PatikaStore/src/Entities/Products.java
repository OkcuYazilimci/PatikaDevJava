package Entities;

public abstract class Products {
    private static int nextId = 0;
    private int id;
    private String name;
    private double price;
    private int stock;
    private String brand;
    private int discount;
    private int ram;
    private String color;
    private int memory;
    private double screenDim;

    public Products() {

    }
    public Products(String brand, String name, double price
                    ,int discount,int stock, int ram, int memory,
                    double screenDim, String color) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.brand = brand;
        this.discount = discount;
        this.ram = ram;
        this.memory = memory;
        this.screenDim = screenDim;
        this.color = color;
    }
    // GETTER SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenDim() {
        return screenDim;
    }

    public void setScreenDim(double screenDim) {
        this.screenDim = screenDim;
    }
}
