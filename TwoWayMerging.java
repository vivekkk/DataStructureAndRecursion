public class TwoWayMerging {

    public int[] twoWayMerging(int a[], int b[]) {
        int i, j, k;
        int mergedarrayLength = a.length + b.length;
        int[] mergedArray = new int[mergedarrayLength];
        for (i = 0, j = 0, k = 0; i < a.length && j < b.length && k < mergedArray.length;) {
            if (a[i] < b[j]) {
                mergedArray[k] = a[i];
                i++;
                k++;
            } else {
                mergedArray[k] = b[j];
                j++;
                k++;
            }

        }
        for (; k < mergedarrayLength && i < a.length; k++, i++) {
            mergedArray[k] = a[i];
        }
        for (; k < mergedarrayLength && j < b.length; k++, j++) {
            mergedArray[k] = b[j];
        }

        return mergedArray;
    }

    public static void main(String arg[])
    {
        TwoWayMerging twm=new TwoWayMerging();
        int[] a={56,78,89,99,108,702,880,660};
        int[] b={-2,25,69,72,120,990};
        int[] c= twm.twoWayMerging(a, b);
        for (int i=0;i<c.length; i++) {
            System.out.print(c[i]+",");
            
        }
    }

}
