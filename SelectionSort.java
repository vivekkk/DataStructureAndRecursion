public class SelectionSort {

    public int[] selectionSort2(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int smallestValueIndex = i;
            for (int j = i ; j < a.length; j++) {
                if (a[smallestValueIndex] > a[j]) {
                    smallestValueIndex = j;
                }
            }
            if (smallestValueIndex != i) {
                int temp = 0;
                temp = a[i];
                a[i] = a[smallestValueIndex];
                a[smallestValueIndex] = temp;
            }

        }

        return a;

    }

    public int[] selectionSort(int[] a, int i) {
        if (isSorted(a)) {
            return a;
        } else {
            int maxindex=i;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[maxindex] < a[j]) {
                    maxindex=j;

                }
            }
            int temp=a[maxindex];
            a[maxindex]=a[i];
            a[i]=temp;           

            return selectionSort(a, i-1);

        }

    }

    public boolean isSorted(int[] a) {
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                b = false;
                break;
            } else {
                b = true;
            }

        }
        return b;
    }

    public static void main(String arg[]) {
        int[] c = { 4, -2, 45, 1,47,-3,100,-2 };
        SelectionSort s = new SelectionSort();
        int[] b = s.selectionSort2(c);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }

    }

}