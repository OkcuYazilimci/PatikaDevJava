package generic;

public class Main {
    public static void main(String[] args) {

        String str = "makarena";
        String str1 = null;
        NullAble n = new NullAble(str);
        NullAble n1 = new NullAble(str1);
       // n1.run();
       // n.run();

        Integer num = null;
        Integer num1 = 69;
        NullAbleInt ni = new NullAbleInt(num);
       // ni.run();
        GenericNullAble<String> gen = new GenericNullAble<>(str1);
        GenericNullAble<String> gen1 = new GenericNullAble<>(str);
        GenericNullAble<Integer> gen2 = new GenericNullAble<>(num);
        GenericNullAble<Integer> gen3 = new GenericNullAble<>(num1);
        gen.run();
        gen1.run();
        gen2.run();
        gen3.run();
    }
}