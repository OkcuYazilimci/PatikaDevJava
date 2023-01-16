public class Main {
    public static void main(String[] args) {
        Staff c1 = new Staff("Umut UYGUN", "5523508242", "uygunu18@itu.edu.tr");
        c1.enter();
        c1.getName(); // ignored ???
        System.out.println("--------------------------------------");

        Academian a1 = new Academian("Bilge PATIKA","53535353","asds@itu.edu.tr","Software","Profesor");
        a1.enterthelesson(); // inherited from super class "Staff"
        System.out.println("--------------------------------------");

        Officer o1 = new Officer("Mahmut TUNCER","52525252", "LO@itu.edu.tr", "9.00-22.00", "Cleaning");
        o1.work();
        System.out.println("--------------------------------------");

        Teacher t1 = new Teacher("Hatice BULUT","3423","2312","SADA","TEACHER","127");
        t1.senate();
        t1.exam();
        t1.getTitle(); // neden ignoder oluyor??
        System.out.println("--------------------------------------");

        Asisstant as1 = new Asisstant("Kemal Sulan", "123","231","JAVA","Asistant","4 hour");
        as1.quiz();
        as1.getOfficehour();
        System.out.println("--------------------------------------");

        LabAsisstant lab1 = new LabAsisstant("Sultan kevgir", "45","45","PC","LAB","5 HOUR");
        lab1.enterthelesson(); //inherited from Academian
        lab1.labentry();
        System.out.println("--------------------------------------");

        Computing co1 = new Computing("halil karadag","3510","5451","5.00-12.00","Science","Data");
        co1.network();
        System.out.println("--------------------------------------");

        Security s1 = new Security("johny sisn","4454","121","7.00-19.00","loby","checked" );
        s1.nobet();
        System.out.println("--------------------------------------");
    }
}