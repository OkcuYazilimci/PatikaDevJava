public class Teacher {
    String name;
    String telNo;
    String branch;
    String code;

    Teacher(String name, String branch, String telNo, String code){
        this.name = name;
        this.branch = branch;
        this.telNo = telNo ;
        this.code = code;
    }
    void print(){
        System.out.println("Teacher's Name: " + this.name);
        System.out.println("Telephone adress: " + this.telNo);
        System.out.println("Lesson code : " + this.branch);
        System.out.println("Teacher's branch : " + this.code);
    }

}

