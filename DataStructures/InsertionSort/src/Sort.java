public class Sort {
    public void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length ; i++)
        {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
