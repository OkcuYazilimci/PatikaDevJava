public class Prime {
    void prime()
    {
        for (int i = 2; i <= 100; i++)
        {
            boolean isPrime = true;
            for (int p = 2; p <= i/2; p++)
            {
                if(i % p == 0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.print(i + ", ");
            }
        }

    }
    void isPrime(int a) {
        boolean isTrue = true;
        for (int p = (a / 2); p >= 2; p--) {
            if (a % p == 0) {
                isTrue = false;
            }
        }
        if (isTrue) {
            System.out.println(a + " number is a prime number");
        } else
            System.out.println(a + " number is not a prime number");
    }
}

