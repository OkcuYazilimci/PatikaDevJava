public class Calculate {

    void calc (int a)
    {
        int i = ((a/2)+1);
        int sum = 0;

        while (i > 0)
        {
            if (a % i == 0)
            {
                sum = sum + i;
            }
            i--;
        }
        if (a == sum)
        {
            System.out.println(a + " is a perfect number!");
        }
        else
            System.out.println(a + " is not a perfect number");

    }
}
