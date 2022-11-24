public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int Grade;
    int verbal;

    Course(String name, String code, String prefix) { //Constructor
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int Grade = 0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Teacher and prefix do not match to each other.");
        }
     }
     void printTeacher(){
        this.teacher.print();
     }
}
