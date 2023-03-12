public class Pattern {
     void desen1(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            desen1((number - 5), temp);
        } else if (number <= 0) {
            desen2(number, temp);
        }
    }

     void desen2(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            desen2((number + 5), temp);
        }
    }
}
