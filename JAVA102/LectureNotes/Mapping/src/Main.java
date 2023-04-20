import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();

        country.put("TR","Turkiye");
        country.put("GR", "Almanya");
        country.put("EN", "Ingiltere");

        System.out.println(country.get("TR"));
        System.out.println(country.get("GR"));
        System.out.println(country.get("EN"));

        for (String countryKey : country.keySet()) {
            System.out.println(countryKey);
        }

        for (String countryValue : country.values()) {
            System.out.println(countryValue);
        }

        for (String countryKey : country.keySet()) {
            System.out.println(country.get(countryKey));
        }
        System.out.println("-------------LINKED HASH MAP-------------");
        // LINKED HASH MAP
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(102, new Student(102, "Umut", 85));

        for (Student stu: students.values()) {
            System.out.println(stu.getName());
        }
        // TREE MAP
        TreeMap<Integer, Student> studentT = new TreeMap<>(new OrderByNote());

        studentT.put(103, new Student(103, "Berke", 23));
        studentT.put(110, new Student(110, "Ozge", 45));
        studentT.put(112, new Student(112, "Su", 89));
        studentT.put(101, new Student(101, "Berk", 78));

        for (Student stuT: studentT.values()) {
            System.out.println(stuT.getName());
        }
    }
}