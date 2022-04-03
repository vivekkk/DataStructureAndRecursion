import java.util.Arrays;

//bubble sort with recursion 
class BubbleSort {

    public int[] bubbleSort(int[] a, int i) {
        int length = a.length;

        if (i < length - 1) {
            if (a[i] <= a[i + 1]) {
                return bubbleSort(a, i + 1);
            } else {
                int temp = 0;
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                return bubbleSort(a, i + 1);

            }
        } else {
            boolean b = false;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
            if (b == false) {
                return bubbleSort(a, 0);
            } else {
                return a;
            }
        }

    }

    public static void main(String arg[]) {
        int[] a = { 59, 6, 1, -2, -3, -44, 90, 6006, 55, -69, 233 };
        BubbleSort b = new BubbleSort();
        int[] c = b.bubbleSort(a, 0);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }

    }
}