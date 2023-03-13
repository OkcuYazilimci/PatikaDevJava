

public class Plus {

    void number(int a)
    {
        int sum = 0;
        while(a != 0)
        {
            sum = sum + (a % 10);
            a = (a / 10);
        }
        System.out.println("the summation of the number you gave is: " + sum);
    }
}
