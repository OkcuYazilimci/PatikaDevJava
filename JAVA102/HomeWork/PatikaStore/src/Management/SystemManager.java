package Management;

import Entities.Brands;
import Entities.Laptop;
import Entities.Phone;

import java.util.Scanner;

public class SystemManager {
    Scanner sc = new Scanner(System.in);
    private BrandManager brandManager;
    private ProductManager productManager;
    private Brands brands;
    public SystemManager() {
        this.brandManager = new BrandManager();
        this.productManager = new ProductManager();
    }
    public void start() {
        brandManager.createBrands();
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("---PATIKA STORE---");
            System.out.println("1 - Notebook Page\n" + "2 - Phone Page\n" +
                    "3 - List Brands\n" + "0 - Exit\n" + "Selection : ");
            int patikaSelect = sc.nextInt();
            switch (patikaSelect) {
                case 1:
                    boolean isTrue2 = true;
                    while(isTrue2) {
                    System.out.println("Welcome to Notebook Page");
                    System.out.println("1 - Add new Laptop");
                    System.out.println("2 - List Laptops");
                    System.out.println("0 - Return main menu");
                    int laptopSelect = sc.nextInt();
                            switch (laptopSelect) {
                                case 1:
                                    productManager.addProduct(new Laptop());
                                    break;
                                case 2:
                                    productManager.listLaptop();
                                    break;
                                case 0:
                                    isTrue2 = false;
                                    break;
                            }
                        }
                    break;
                case 2:
                    boolean isTrue3 = true;
                    while(isTrue3) {
                        System.out.println("Welcome to Smartphone Page");
                        System.out.println("1 - Add new phone");
                        System.out.println("2 - List phones");
                        System.out.println("0 - Return main menu");
                        int laptopSelect2 = sc.nextInt();
                        switch (laptopSelect2) {
                            case 1:
                                productManager.addProduct(new Phone());
                                break;
                            case 2:
                                productManager.listPhone();
                                break;
                            case 0:
                                isTrue3 = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("      OUR BRANDS");
                    brandManager.ListBrands();
                    break;
                case 0:
                    System.out.println("THANK YOU FOR YOUR VISIT");
                    isTrue = false;
                    break;
                default:
                    System.out.println("INVALID SELECTION");
                    break;
            }
        }
    }}
