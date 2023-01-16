public class Asisstant extends Academian{
    private String officehour;

    public Asisstant(String name, String phone, String email, String department, String title, String officehour) {
        super(name, phone, email, department, title);
        this.officehour = officehour;
    }

    public String getOfficehour() {
        return officehour;
    }
    public void setOfficehour(String officehour) {
        this.officehour = officehour;
    }


    public void quiz() {
        System.out.println(getName() + "has sent quiz request");
    }
}
