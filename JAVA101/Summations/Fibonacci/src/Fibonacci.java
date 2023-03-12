public class Fibonacci {
    int fib(int a)
    {
        if (a <= 1)
        {
            return a;
        }
        else
            return (fib((a - 2)) + fib ((a - 1)));
    }
}
