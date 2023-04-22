public class Main {
    public static void main(String[] args) {
        Mylist<Integer> liste = new Mylist<>();

        System.out.println("Dizi kapasitesi : " + liste.getCapacity());
        liste.add(12);
        liste.add(10);
        liste.add(13);
        liste.add(22);
        System.out.println("Eleman sayisi : " + liste.size());
        System.out.println(liste.toString());

        Mylist<String> listt = new Mylist<>();
        listt.add("u");
        listt.add("m");
        System.out.println(listt.toString());
    }
}