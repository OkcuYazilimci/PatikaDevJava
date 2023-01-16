public class Computing extends Officer{
    private String task;

    public Computing(String name, String phone, String email, String shift, String department,String task) {
        super(name, phone, email, shift, department);
        this.task = task;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }


    public void network() {
        System.out.println(getName() + " has setted.");
    }
}
