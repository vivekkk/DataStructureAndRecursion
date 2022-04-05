public class InsertionSort {
    public int[] insertionSortAlgo(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] < a[j]) {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }

        return a;
    }

    public static void main(String arg[]) {
        InsertionSort is=new InsertionSort();
        int[] a={ 4, -2, 45, 1,47,-3,100,-2 };
        int[] b=is.insertionSortAlgo(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }

    }

}