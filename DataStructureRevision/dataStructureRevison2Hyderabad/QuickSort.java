public class QuickSort {
    

    public void quickSortAlgo(int bi, int ei, int a[])  // int[] a={56,3,23,78,-1,6,2,7};
    {
        int pivot=bi;
        if(ei>bi)
        {
            int i,j;
            for(i=bi+1,j=ei; i<=ei && j>=bi;)
            {
                if(a[i]<a[pivot])
                {
                  i++;
                }
                if(a[j]>a[pivot])
                {
                    j--;
                }
                if(i>j)
                {
                 break;
                }
                if(a[i]>a[pivot] && a[j]<a[pivot])
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
            int temp;
            temp=a[pivot];
            a[pivot]=a[j];
            a[j]=temp;
            
            quickSortAlgo(bi,j,a);
            quickSortAlgo(j+1,ei,a);

        }
        else 
        {
            return;
        }
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
           System.out.print(a[i] + ",");
        }
     }

    public static void main(String args[])
    {
        int[] a={56,3,23,78,-1,6,2,7};
        QuickSort q= new QuickSort();
        q.quickSortAlgo(0, 7, a);
        q.printArray(a);


    }
}

