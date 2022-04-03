import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

 public class UBSinterviewMergeSort {
public static void main(String arg[])
{
    List<Integer> a=new ArrayList<>();
    a.add(7);
    a.add(5);
    a.add(3);
    a.add(1);

    
    int b =UBSinterviewMergeSort.largestCountValue(a);
    System.out.println(b);


        
    
}

    public static int largestCountValue(List<Integer> a) throws IndexOutOfBoundsException {
        // Write your code herr

        int mergecounter = 0;
        int sizeOfarray = a.size();

        if (sizeOfarray < 2) {
            return 0;
        } 
        else {

            int leftListSize = 0;
            int rightListSize = 0;

            if (sizeOfarray % 2 == 0) {
                leftListSize = rightListSize = sizeOfarray / 2;
            } else {
                leftListSize = (sizeOfarray - sizeOfarray / 2);
                rightListSize = sizeOfarray / 2;

                System.out.println("rt"+rightListSize);
                System.out.println("lt"+leftListSize);

            }
            // splitting the list>
            List<Integer> listLeft = new ArrayList<>();
            List<Integer> listRight = new ArrayList<>();
            // assigning elements to the leftlists
            for (int i = 0; i < leftListSize; i++) {
                listLeft.add(a.get(i));
            }
            // assigning elements to the right list
            for (int i = leftListSize; i < sizeOfarray; i++) {
                listRight.add(a.get(i));
            }
            // counter calculation
            for (int i = 0; i <= leftListSize - 2; i++) {
                if (listLeft.get(i) > listLeft.get(i + 1)) {
                    int temp = listLeft.get(i);
                    listLeft.add(i, listLeft.get(i + 1));
                    listLeft.add(i + 1, temp);
                    mergecounter = mergecounter + 1;
                }

            }
            for (int i = 0; i <= rightListSize - 2; i++) {
                if (listRight.get(i) > listRight.get(i + 1)) {
                    int temp = listRight.get(i);
                    listRight.add(i, listRight.get(i + 1));
                    listRight.add(i + 1, temp);
                    mergecounter = mergecounter + 1;
                }

            }

            return mergecounter + largestCountValue(listLeft) + largestCountValue(listRight);

        }

    }

}


