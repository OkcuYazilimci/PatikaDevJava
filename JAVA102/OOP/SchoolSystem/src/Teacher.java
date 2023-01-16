public class Teacher extends Academian{
    private String doorno;

    public Teacher(String name,String phone,String email, String department, String title,String doorno) {
        super(name, phone, email, department, title); //double inherited from Academian super class which was inherited from Staff
        this.doorno = doorno;
    }
    public String getDoorno() {
        return doorno;
    }
    public void setDoorno( String doorno ) {
        this.doorno = doorno;
    }


    public void senate() {
        System.out.println(getName() + " has entered the meeting");
    }
    public void exam() {
        System.out.println(getName() + " has sent exam request");
    }

}
