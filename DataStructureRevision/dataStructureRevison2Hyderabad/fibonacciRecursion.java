class fibonacciRecursion {

    public int fibonacci(int n) {
        if (n >= 0) {

            if (n == 0 || n == 1) {
                return n;
            } else {
               // System.out.println("its fibnocci" + n);
                return fibonacci(n - 2) + fibonacci(n - 1);
            }
        } else
            return 0;
    }

    public static void main(String arg[]) {
        fibonacciRecursion fr = new fibonacciRecursion();

        for (int i = 0; i <= 10; i++) {
            System.out.println(fr.fibonacci(i));
        }

    }

    }



