import java.util.ArrayList;
import java.util.Collections;

class BucketSortAlgorithm {

    public int[] bucketSort(int[] a) {
        int len = a.length;
        // Calculating the numbero of buckets
        int numberOfbuckets = (int) Math.ceil(Math.sqrt(len));
        System.out.println("no of buckets = " + numberOfbuckets);
        // Creating the bucket using arraylist collections
        ArrayList<Integer>[] buckets = new ArrayList[numberOfbuckets];
        for (int i = 0; i < numberOfbuckets; i++) {
            buckets[i] = new ArrayList<>();
        }
        // let max value is 0
        int maxValue = 0;
        // finding the maxValue from the Array
        for (int i = 0; i < a.length; i++) {
            if (maxValue < a[i]) {
                maxValue = a[i];
            }

        }

        // fitting each element in the bucket
        for (int i = 0; i < len; i++) {
            int toBeassignedBucket = (int) Math.ceil((float) a[i] * numberOfbuckets / (float) maxValue);
            System.out.print("To be assigned bucket= " + toBeassignedBucket);

            buckets[toBeassignedBucket - 1].add(a[i]);
        }
        // Printing the buckets befor sorting
        for (int i = 0; i < numberOfbuckets; i++) {
            printBuckets(buckets[i]);
        }
        // sorting the buckets..
        ArrayList<Integer>[] b = sortArrayList(buckets);
        System.out.println("Sorted Arraylist");
        for (int i = 0; i < numberOfbuckets; i++) {
            printBuckets(b[i]);
        }

        // assigning sorted buckets to the Array elements
        int index = 0;
        for (ArrayList<Integer> bucket : b) {
            for (Integer i : bucket) {
                a[index] = i;
                index = index + 1;
            }

        }

        return a;
    }

    // Sorting each bucket..
    public ArrayList<Integer>[] sortArrayList(ArrayList<Integer>[] a) {
        for (int i = 0; i < a.length; i++) {
            Collections.sort(a[i]);
        }
        return a;
    }

    // Method for Printing the buckets..
    public void printBuckets(ArrayList<Integer> a) {
        for (Integer i : a) {
            System.out.print(i + ",");

        }
        System.out.println("---");
    }

    public static void main(String arg[]) {
        int[] a = { 9, 7, 5, 4, 2, 1, 3, 6, 8 };
        BucketSortAlgorithm b = new BucketSortAlgorithm();
        int[] c = b.bucketSort(a);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }

    }
}