public class Security extends Officer{
    private String certificate;

    public Security(String name, String phone, String email, String shift, String department,String certificate) {
        super(name, phone, email, shift, department);
        this.certificate = certificate;
    }

    public void nobet() {
        System.out.println(getName() + "is in the shift betweeen " + getShift());
    }

}
