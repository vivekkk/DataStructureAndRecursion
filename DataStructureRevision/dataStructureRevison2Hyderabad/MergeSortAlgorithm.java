/// This is modified merge sort for UBS question asked in interview......

public class MergeSortAlgorithm {

   int count;
   public int mergesort(int begIndex, int endingIndex, int[] a) {
      int mid = (endingIndex + begIndex) / 2;
      if (endingIndex <= begIndex) {
         return 0;
      }
      else{

      System.out.println(begIndex + " first print " + mid);

      mergesort(begIndex, mid, a);
      //System.out.println((mid + 1) + " Second Print " + endingIndex);
      mergesort(mid + 1, endingIndex, a);
     // System.out.println((begIndex) + " merge " + "mid: " + mid + " endind Index " + endingIndex);
      int test=merge(begIndex, mid, endingIndex, a);
      count=count+test;
      }

      return count;
   }

   public int merge(int bi, int mid, int ei, int a[]) {
      int mergecount=0;
      int[] temp = new int[ei - bi + 1];
      int i, j, k;

      for (i = bi, j = mid + 1, k = 0; k < temp.length && i <= mid & j <= ei;) {
         if (a[i] < a[j]) {
            temp[k] = a[i];
            k++;
            i++;
            

         } else {
            temp[k] = a[j];
            k++;
            j++;
            mergecount=mergecount+1;
         }
      }

      for (; i <= mid && k < temp.length; k++, i++) {  // the left emelemts of the array if not copied
         temp[k] = a[i];
      }

      for (; j <= ei && k < temp.length; k++, j++) { // the left emelemts of the array if not copied
         temp[k] = a[j];
      }

      for (int r = bi, z=0; r <= ei && z < temp.length ; r++, z++) {  // copying the element in a array;
         a[r] = temp[z];
      }
      return mergecount;

   }

   public void printArray(int[] a) {
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + ",");
      }
   }

   public static void main(String arg[]) {
      int[] a = {2,1,3};
      MergeSortAlgorithm m = new MergeSortAlgorithm();
     int t= m.mergesort(0, 2, a);
      System.out.println("count"+ t);
      

   }

}
