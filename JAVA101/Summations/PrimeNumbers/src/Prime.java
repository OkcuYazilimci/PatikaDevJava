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
}

