import java.util.function.IntFunction;

public class Test {
    public static void main(String[] args) {
       IntFunction<Long> factorialCalc = new IntFunction<Long>() {
          @Override//    w w w    .  d  e  m o 2  s  .   c o  m  
          public Long apply(int n) {
              if (n < 0) {
                  String msg = "Number must not be negative.";
                  throw new IllegalArgumentException(msg);
              }

              if (n == 0) {
                  return 1L;
              } else {
                  return n * this.apply(n - 1);
              }
          }
        };
        int n = 5;
        long fact = factorialCalc.apply(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}