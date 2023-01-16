public class Academian extends Staff{
    private String department;
    private String title;
    public Academian(String name, String phone, String email, String department, String title) {
        super(name, phone, email); // super() key word provides to use Constructer method which belongs to super class
        // always super inheritence is written top of the constructor method!!!!
        this.department = department;
        this.title = title;
    }
    public String getDepartment(){
        return department;
    }

    public void setDepartment( String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle( String title ){
        this.title = title;
    }


    public void enterthelesson(){
        System.out.println(this.title +" "+ this.getName()+" from " + this.department + " department " +  "has entered the university. ");
    } // overloaded inherited method
}


