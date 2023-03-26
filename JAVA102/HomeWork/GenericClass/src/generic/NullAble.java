package generic;

public class NullAble {
    private final String value;

    public NullAble(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    /* DUE TO FINAL KEYWORD WE CANNOT SET DIFFERENT VALUE!!!!
    public void setValue(String value) {
        this.value = value;
    }*/

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run()
    {
        if (isNull()) {
            System.out.println("there is not any asserted value to this variable (null)");
        }
        else {
            System.out.println(this.getValue());
        }
    }

}
