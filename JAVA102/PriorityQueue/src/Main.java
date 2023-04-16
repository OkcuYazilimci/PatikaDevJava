import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* HASH SET
        ##################
         HashSet<Student> students = new HashSet<>();
         HashSet'de rasgele hafizada yer ayrilarak liste elemanlari gelisiguzel sekilde
         print edilir belirli bir siralama duzeni yoktur.
        ##################
         */

        /* TREE SET
        ##################
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());

        students.add(new Student("Umut", 100));
        students.add(new Student("Ahmet", 30));
        students.add(new Student("Ali", 20));
        students.add(new Student("Ahmet", 40));
        students.add(new Student("Zehra", 30));

        for(Student stu : students) {
        System.out.println(stu.getName() + " " + stu.getNote());
        ##################
         */

        /* ARRAY LIST
        ##################

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(25);
        liste.add(1);
        liste.add(99);
        liste.add(null);

        System.out.println(liste);
        System.out.println("##################");
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("##################");
        for (Integer element : liste){
            System.out.print(element + " ,");
        }
        System.out.println("##################");
        System.out.println(liste.size());
        System.out.println("##################");
        System.out.println(liste.get(2)); // max indexten buyuk bir index verirsek throws exception
        System.out.println("##################");
        System.out.println(liste.indexOf(null));
        System.out.println("##################");
        liste.add(2,1); // indexleri kaydirarak girilen veriyi ekler
        liste.set(2, 15); // 2. indexteki veriyi silip yerine 15 ekler
        liste.contains(10); //listede arama yapar true veya false dondurur
        System.out.println("##################");
        Integer[] str = liste.toArray(new Integer[4]);
        System.out.println(str[2]); */
    /* LINKED LIST
    System.out.println("##################");
     */


    }
}
