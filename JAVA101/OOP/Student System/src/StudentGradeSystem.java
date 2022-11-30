public class StudentGradeSystem {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Umut Uygun","SWE","0552 350 82 82","Software Engineering");
        Teacher T2 = new Teacher("Patika.dev","COS","0001","Computer Engineering");
        Teacher T3 = new Teacher("Stephen king","DAT","0000","Data Engineering");
        Course softWare = new Course("Software Engineering","101","SWE");
        Course computerScience = new Course("Computer Engineering","102","COS");
        Course dataScience = new Course("Data Engineering","103","DAT");
            softWare.addTeacher(T1);
                System.out.println("--------------------");
            computerScience.addTeacher(T2);
                System.out.println("--------------------");
            dataScience.addTeacher(T3);
                System.out.println("--------------------");
        Student s1 = new Student("Hope Vegas","010180177","4",softWare,computerScience,dataScience);
        s1.printStudent();
        s1.addBulkExamNote(100,56,60,35,60,75);
        System.out.println("--------------------");
        s1.isPass();
    }
}