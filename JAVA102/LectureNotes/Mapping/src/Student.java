public class Student {
    private String name;
    private int note;
    private int studentNumber;

    public Student(int studentNumber, String name, int note) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
