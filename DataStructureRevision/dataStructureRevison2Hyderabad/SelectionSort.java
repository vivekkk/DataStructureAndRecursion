public class SelectionSort {

    public int[] selectiosort(int[] a) {

        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j; i < a.length; i++) {
                if (a[minimumIndex] > a[i]) {
                    minimumIndex = i;
                }
            }

            int temp = a[j];
            a[j] = a[minimumIndex];
            a[minimumIndex] = temp;
        }
        return a;
    }

    public static void main(String arg[]) {
        int[] a = { 23, 54, -67, 34, 21, -1, 200 };
        SelectionSort s = new SelectionSort();
        int c[] = s.selectiosort(a);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }

    }
}
