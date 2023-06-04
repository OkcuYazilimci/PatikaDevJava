package Management;

import Entities.Brands;

import java.util.TreeSet;

public class BrandManager {
    private static TreeSet<Brands> brandList;

    public void createBrands(){
        BrandManager brandManager = new BrandManager(brandList);
        brandList.add(new Brands("Samsung"));
        brandList.add(new Brands("Lenovo"));
        brandList.add(new Brands("Huawei"));
        brandList.add(new Brands("Casper"));
        brandList.add(new Brands("Asus"));
        brandList.add(new Brands("HP"));
        brandList.add(new Brands("Xiaomi"));
        brandList.add(new Brands("Monster"));
    }
    public BrandManager() {
        brandList = new TreeSet<>(new OrderBrand());
    }

    public BrandManager(TreeSet<Brands> brands) {
        brandList = brands;
    }

    public void ListBrands() {
        {System.out.println("----------------------");
            for (Brands item : brandList) {

                System.out.println("ID: " + item.getID() +
                        " | " + "Brand: " + item.getBrandName());
                System.out.println("----------------------");
            }
        }
    }
}

