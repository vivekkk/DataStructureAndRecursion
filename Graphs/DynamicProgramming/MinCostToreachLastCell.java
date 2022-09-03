public class MinCostToreachLastCell {

   public int minCostReach(int[][] a, int si, int sj, int ei, int ej) {
      if (si == ei && sj == ej) {
         return a[ei][ej];
      }

      else {
         int cost1 = 0, cost2 = 0;

         if (si + 1 <= 4) {
            // System.out.println(a[si][sj] +" Next Move "+a[si+1][sj]);
            cost1 = a[si][sj] + minCostReach(a, si + 1, sj, ei, ej);
         } else {
            cost1 = Integer.MAX_VALUE; // this step is important as the 0 cost was becoming as minimum as the min was
                                       // not calculated correctly..
         }

         if (sj + 1 <= 4) {
            // System.out.println(a[si][sj] +" Next Move "+a[si][sj+1]);
            cost2 = a[si][sj] + minCostReach(a, si, sj + 1, ei, ej);
         } else {
            cost2 = Integer.MAX_VALUE;
         }
         // System.out.println(cost1 + " "+ cost2);
         return Math.min(cost1, cost2);

      }
   }

   public int noOfWaysForaGivenSum(int[][] a, int si, int sj, int ei, int ej, int sum, int count) {
      if (si == ei && sj == ej && sum == 0) {
         count = count + 1;
         return count;
      }else if(sum<=0)
      {
         return count;
      } 
      else {
         if(si+1<=4 && sj+1<=4){
         sum = sum - a[si][sj];
         }

         if (si + 1 <= 4) {
           
          count = noOfWaysForaGivenSum(a, si + 1, sj, ei, ej, sum, count);
         } 
         if (sj + 1 <= 4) {
         
            count = noOfWaysForaGivenSum(a, si, sj + 1, ei, ej, sum, count);
         }

      }
      return count;

   }

   public static void main(String arg[]) {
      int[][] a = new int[5][5];
      a[0][0] = 4;
      a[0][1] = 7;
      a[0][2] = 8;
      a[0][3] = 6;
      a[0][4] = 4;
      a[1][0] = 6;
      a[1][1] = 7;
      a[1][2] = 3;
      a[1][3] = 9;
      a[1][4] = 2;
      a[2][0] = 3;
      a[2][1] = 8;
      a[2][2] = 1;
      a[2][3] = 2;
      a[2][4] = 4;
      a[3][0] = 7;
      a[3][1] = 1;
      a[3][2] = 7;
      a[3][3] = 3;
      a[3][4] = 7;
      a[4][0] = 2;
      a[4][1] = 9;
      a[4][2] = 8;
      a[4][3] = 9;
      a[4][4] = 3;
    
    int[][] b={
      {4,7,1,6},
      {5,7,3,9},
      {3,2,1,2},
      {7,1,6,3}};

      
      MinCostToreachLastCell m = new MinCostToreachLastCell();
      System.out.println(m.minCostReach(a, 0, 0, 4, 4));
      System.out.println(m.noOfWaysForaGivenSum(b, 0, 0, 3, 3, 25, 0));

   }

}
