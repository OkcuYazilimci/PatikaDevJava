public class Triangle {

    void triangle(int a)
    {
        // 2n - 1 (* number)
        int p = a;
        while (a > 0)
        {
            for (int u = 0; u < p - a; u++)
            {
                System.out.print(" ");
            }
            int star = (2 * a - 1);
            while (star > 0)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            a--;
        }
    }
}
