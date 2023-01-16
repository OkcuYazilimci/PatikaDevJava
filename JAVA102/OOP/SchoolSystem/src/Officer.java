public class Officer extends Staff {
    private String shift;
    private String department;

    public Officer(String name, String phone, String email, String shift, String department) {
        super(name, phone, email);
        this.shift = shift;
        this.department = department;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    public void work() {
        System.out.println(getName() + " from " + this.department + " Has started the work. ");
    }

}

