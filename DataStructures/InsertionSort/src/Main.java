import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {22, 27, 16, 2, 18, 6};
        Sort sorter = new Sort(); // var sorter = new Sort() da çalıştı nasıl çalıştı ??
        sorter.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}