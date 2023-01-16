public class Staff { // super class
    private String name;
    private String phone;
    private String email; /* private is an access modifier. It enables to access only  within the class. It cannot be
    accessed through classes */

    public Staff(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    } //Constructor method

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    } // getter setter for name variable

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // getter setter ends here

    public void enter() {
        System.out.println(this.name + " has entered the university !! ");
    }

    public void exit() {
        System.out.println(this.name + " has left the university !! ");
    }

    public void cafetery() {
        System.out.println(this.name + " has entered the cafetery !! ");
    }
}
