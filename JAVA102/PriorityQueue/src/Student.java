public class Student {
    private int note;
    private String name;

    public Student(String name, int note)
    {
        this.name = name;
        this.note = note;
    }

    public int getNote() {return note;}
    public void setNote(int note) {
        if(note > 100 || note < 0) {
            note = 0;}
            this.note = note;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
