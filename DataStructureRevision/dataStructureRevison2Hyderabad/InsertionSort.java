public class InsertionSort {

    int[] a = { 23, 54, -67, 34, 21, -1, 200 };
    public int[] insertionSort(int a[]) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j <= i; j++) {
                if (a[i] < a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }

    public void swap(int i, int j)
    {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;

        
    }

    public static void main(String arg[]) {

        
        InsertionSort is = new InsertionSort();
        int c[] = is.insertionSort(a);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
    }
}
