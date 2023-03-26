package generic;

public class NullAbleInt {
    private final Integer number;

    NullAbleInt (Integer number)
    {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    //SETTER YOK
    // int yazdığımızda isNull çalışmıyor ama Integer yazınca çalışıyor.
    public boolean isNull() {
      return this.getNumber() == null;
    }

    public void run() {
        if (isNull())
        {
            System.out.println("there is not any asserted value to this variable (null)");
        }
        else {
            System.out.println(this.getNumber());
        }

    }
}
