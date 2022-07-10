public class MergeSortImplementation {

    public void divide(int[] a, int si, int ei) {
        int mid = (si + (ei - si) / 2);
        if (si >= ei) {
            return;
        }
        System.out.println("divide1(" + a + "," + si + "," + mid + ")");
        divide(a, si, mid);
        int mid2 = mid + 1;
        System.out.println("divide2(" + a + "," + mid2 + "," + ei + ")");
        divide(a, mid + 1, ei);
        System.out.println("MergeCalledFor" + "," + si + "," + mid + "," + ei);
        merge(a, si, mid, ei); 

    }

    public void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int k = 0;
        int i = si;
        int j = mid + 1;
        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                i = i + 1;
                k = k + 1;
            } else {
                temp[k] = arr[i];
                j = j + 1;
                k = k + 1;
            }

        }

        while (i <= mid) {
            temp[k] = arr[i];
            i = i + 1;
            k = k + 1;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j = i + 1;
            k = k + 1;

        }

 

        
        // copiying all array data in main array
        for (int g = si, h = si; g < k && h < k; g++, h++) {
            System.out.print(g+","+  h);
           arr[g]=temp[h];
          

       System.out.println("\n");
           for(int l: arr)
           {System.out.print(l+",");}
        }

    }

    public static void main(String arg[]) {
        MergeSortImplementation msi = new MergeSortImplementation();
        int[] a = { 9, 3, 8, 6, 10, 76, 34 };
        int l=a.length-1;
       msi.divide(a, 0, l);
       for(int i: a)
       {
           System.out.println(i);
       }

    }
}