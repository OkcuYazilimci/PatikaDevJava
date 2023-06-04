package Management;

import Entities.Brands;

import java.util.Comparator;

public class OrderBrand implements Comparator<Brands> {

    @Override
    public int compare(Brands o1, Brands o2) {
        return o1.getBrandName().compareTo(o2.getBrandName());
    }
}
