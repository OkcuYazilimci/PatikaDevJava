public class LabAsisstant extends Asisstant{
    public LabAsisstant(String name, String phone, String email, String department, String title, String officehour){
        super(name, phone, email, department, title, officehour);}

    public void labentry() {
        System.out.println(getName() + "has entered the lab");
    }
}
