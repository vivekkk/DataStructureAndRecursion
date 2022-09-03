import java.util.*;

public class HouseRobber {

    public int HouseRobberVivek(int[] a) {
        int max = 0;
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = HouseRobberPlainRecursion(a, i, 0);
            if (b[i] >= max) {
                max = b[i];
            }

        }
        return max;

    }

    public int HouseRobberPlainRecursion(int a[], int i, int sum) { // this logic does not work
        if (i >= a.length) {
            return 0;
        } else {
            if (i + 2 < a.length && i + 3 < a.length) {
                if (a[i + 2] < a[i + 3]) {
                    return sum = a[i] + HouseRobberPlainRecursion(a, i + 3, sum);
                } else {
                    return sum = a[i] + HouseRobberPlainRecursion(a, i + 2, sum);
                }
            }

            else {
                return sum = a[i] + HouseRobberPlainRecursion(a, i + 2, sum);
            }
        }

    }

    public int houseRobberRecursion(int[] a, int i) {
        if (i >= a.length) {
            return 0;
        }
        if (i == a.length - 1) {
            return a[i];
        } else {
            int selected = a[i] + houseRobberRecursion(a, i + 2);
            int rejected = houseRobberRecursion(a, i + 1);
            return Math.max(selected, rejected);

        }

    }

    public  int houseRobberDynamicProgTopDown(int a[],int i, HashMap<Integer,Integer> h)
    {
      if(i>=a.length)
      {
        return 0;
      }
      else if(!h.containsKey(i))
      {
          int selected=a[i] + houseRobberDynamicProgTopDown(a,i+2,h);
          int rejected=houseRobberDynamicProgTopDown(a,i+1,h);
          int max=Math.max(selected, rejected);
          h.put(i, max);
      }
      return h.get(i);

    }

    public  int houseRobberDynamicProgBottomUp(int a[],int i, HashMap<Integer,Integer> h)
    {
        h.put(a.length-1, a[a.length-1]);
        h.put(a.length-2, Math.max(a[a.length-2], a[a.length-1]));
        for(int j=a.length-3;j>=0;j--)
        {
            if(!h.containsKey(j))
            {
                h.put(j, Math.max(h.get(j+1),a[j]+h.get(j+2)));
            }
        }
        return h.get(i);
    }

    public static void main(String arg[]) {
        HouseRobber rob = new HouseRobber();
        int a[] = { 2, 4, 3, 6, 20, 10, 2 }; // wrong logic fails for this array;
        // System.out.println(rob.HouseRobberVivek(a));
        HashMap<Integer,Integer> h=new HashMap<>();
        System.out.println(rob.houseRobberDynamicProgBottomUp(a, 0,h));

    }
}
