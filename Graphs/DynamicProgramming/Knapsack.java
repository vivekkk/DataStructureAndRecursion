
public class Knapsack {

    public int knapsackproblem(int[][] fruits, int start, int weight) {
   
        if (start > fruits.length - 1 || weight == 7) {
            return 0;
        } 
        if(weight>7)
        {
           return 0;
        }
       if (weight <= 7 &&  weight>=0) {
         if( weight + fruits[start][0] >7)
         {
            return 0;
         }
         else 
         {
         int profit1 = fruits[start][1] + knapsackproblem(fruits, start + 1, weight + fruits[start][0]);
         System.out.println(start+" Profit1"+"="+profit1);
          int   profit2 = knapsackproblem(fruits, start + 1, weight );
          System.out.println(start+" Profit2"+"="+profit2);
          System.out.println("Profit for "+start+" maximum="+ Math.max(profit1, profit2));
            return Math.max(profit1, profit2);
      } 
    
    }
        
        else {
            return 0;
        }

    }

    public static void main(String arg[]) {
        Knapsack k = new Knapsack();
        int a[][] = new int[4][2];
        a[0][0] = 3;
        a[0][1] = 31;
        a[1][0] = 1;
        a[1][1] = 26;
        a[2][0] = 2;
        a[2][1] = 17;
        a[3][0] = 5;
        a[3][1] = 72;
        System.out.println(k.knapsackproblem(a, 0, 0));

    }
}
