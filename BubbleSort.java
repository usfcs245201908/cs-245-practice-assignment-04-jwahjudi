public class BubbleSort implements SortingAlgorithm{
    public void sort(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    swap(a,j,j+1);
                }
    }

    public void swap(int[] a, int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
