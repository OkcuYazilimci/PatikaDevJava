package Management;
import Entities.Brands;
import Entities.Laptop;
import Entities.Phone;
import Entities.Products;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Phone> phoneList = new ArrayList<>();
    private ArrayList<Laptop> laptopList = new ArrayList<>();


    public void listLaptop() {
        System.out.println("----------------------------------------------------");
        System.out.println("    OUR PRODUCTS");
        System.out.println("----------------------------------------------------");
        System.out.println("|  ID  | NAME              | PRICE    | BRAND    | MEMORY  | " +
                "SCREEN  | RAM  | COLOR    | ");
        System.out.println("----------------------------------------------------");
        for(Laptop item : laptopList) {
            System.out.println("|  " + item.getId() + "   | " + item.getName()  + "            | " +
                    item.getPrice() + "    | " + item.getBrand() + "      | " + item.getMemory() +
                    "        | " + item.getScreenDim() + "       | " + item.getRam() + "      | " + item.getColor() +
            "            | ");
            System.out.println();
        }
    }
    public void listPhone() {
        System.out.println("    OUR PRODUCTS");
        for(Phone item : phoneList) {
            System.out.println("ID : " + item.getId() + " | " +
                    "Name: " + item.getName());
            System.out.println("-----------------");
        }
    }


    public void addProduct(Products products) {
        System.out.print("brand: ");
        String brand = sc.nextLine();
        System.out.println();

        System.out.print("Product Name: ");
        String name = sc.nextLine();
        System.out.println();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.println();

        System.out.print("Discount: ");
        int disc = sc.nextInt();
        System.out.println();

        System.out.print("Stock: ");
        int stock = sc.nextInt();
        System.out.println();

        System.out.print("RAM: ");
        int ram = sc.nextInt();
        System.out.println();

        System.out.print("Memory: ");
        int mem = sc.nextInt();
        System.out.println();

        System.out.println("Screen dimension: ");
        double dim = sc.nextDouble();
        System.out.println();

        System.out.print("Color: ");
        sc.nextLine();
        String color = sc.nextLine();
        System.out.println();

        if(products instanceof Laptop) {
            laptopList.add((new Laptop(brand, name, price, disc,
                    stock, ram, mem, dim,color)));
        }
        else if(products instanceof Phone) {
            System.out.println("Battery: ");
            int bat = sc.nextInt();
            System.out.println();

            phoneList.add(new Phone(brand, name, price, disc,
                    stock, ram, mem, dim,bat,color));
            System.out.println("New phone added to the system");
        }
        System.out.println("New product named " + name + " added to the system!");
    }
}
