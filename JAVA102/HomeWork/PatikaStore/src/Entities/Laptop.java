package Entities;

public class Laptop extends Products{

    public Laptop(){}
    public Laptop(String brand, String name, double price, int discount, int stock, int ram, int memory, double screenDim, String color) {
        super(brand, name, price, discount, stock, ram, memory, screenDim, color);
    }

    /*System.out.print("brand: ");
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
                            String color = sc.nextLine();
                            System.out.println(); */
}
