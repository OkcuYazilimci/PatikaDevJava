package Entities;

public class Brands {
    public static int nextID = 0;
    private final int ID;
    private String brandName;

    public Brands(String brandName) {
        this.ID = nextID;
        nextID++;
        this.brandName = brandName;
    }

    public int getID() {
        return ID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
