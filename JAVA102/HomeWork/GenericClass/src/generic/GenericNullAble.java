package generic;

public class GenericNullAble <T> {
    private final T value;

    public GenericNullAble(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull()
    {
        return getValue() == null;
    }

    public void run() {
        if (isNull())
        {
            System.out.println("there is not any asserted value to this variable (null)");
        }
        else {
            System.out.println(this.getValue());
        }
    }
}
