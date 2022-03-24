

public class fibnocciSeries {

    public int fibnocci(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        }
        if (value > 1) {

            int test = fibnocci(value - 1) + fibnocci(value - 2);
            // System.out.println(test);
            return test;

        } else {
            return -1;
        }
    }

    public void printFibnocciSeries(int n) {
        for (int i = 0; i <= n; i++) {
            int x = fibnocci(i);
            System.out.print(x);
            System.out.print(",");
        }
    }

    public int sumOfdigits(int digit) {
        if (digit / 10 == 0) {
            return 0;
        } else {
            return digit % 10 + sumOfdigits(digit / 10);
        }
    }

    public int powerOfNumber(int num, int n) {
        if (n == 0 || n < 0) {
            return 1;
        } else if (n == 1) {
            return num;
        } else {

            return num * powerOfNumber(num, n - 1);
        }

    }

    public int gcdOfTwoNumbers(int a, int b) // Ecludian algorithm
    {
        if (b == 0) {
            return a;
        } else {
            return gcdOfTwoNumbers(b, a % b);
        }
    }

    public void decimalTobinaryUsingRecursion(int n) {

        if (n == 0) {
            System.out.print(0);
            return;

        }
        decimalTobinaryUsingRecursion(n / 2);
        System.out.print(n % 2);

    }

    public int factorial(int n) {
        if (n <= 0 || n == 1) {
            return 1;

        } else
            return n * factorial(n - 1);
    }

    public int productOfArray(int[] arr, int length) {
        if (length < 0) {
            return 1;
        } else
            return arr[length] * productOfArray(arr, length - 1);

    }

    public String reverseOfString(String s) {
        if (s.length() == 0) {
            return "";

        } else
            return s.substring(s.length() - 1, s.length()) + reverseOfString(s.substring(0, s.length() - 1));

    }

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));

        } else
            return false;

    }

    public char firstUpperCase(String s) {
        int n = s.length();
        if (n == 0) {
            return '0';
        } else if (s.charAt(n - 1) <= 90) {
            return s.charAt(n - 1);
        } else {
            return firstUpperCase(s.substring(0, n - 1));

        }
    }

    public String stringUpperCase(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        // else if(s.charAt(0)==32){
        // return stringUpperCase(s.substring(1, n);
        // }
        else if (s.charAt(0) <= 122 && s.charAt(0) >= 97)

        {

            System.out.println(Character.toString((char) (97 + (s.charAt(0)))));
            return Character.toString((char) (65 + (s.charAt(0) - 97))) + stringUpperCase(s.substring(1, n));

        } else if (s.charAt(0) == 32) {
            return Character.toString((char) (32)) + stringUpperCase(s.substring(1, n));

        } else {

            return stringUpperCase(s.substring(1, n));
        }

    }

    public static void main(String arg[]) {

        fibnocciSeries f = new fibnocciSeries();
        f.printFibnocciSeries(10);
        int y = f.sumOfdigits(163456);
        // System.out.println(y);
        int z = f.powerOfNumber(2, 8);
        // System.out.println(z);
        int e = f.gcdOfTwoNumbers(48, 18);
        // System.out.println(e);

        f.decimalTobinaryUsingRecursion(25000);
        int k = f.factorial(5);
        System.out.println("\n");
        // System.out.println(k);
        int[] arr = { 1, 2, 3, 4, 5 };
        int h = f.productOfArray(arr, arr.length - 1);
        System.out.println(h);
        String l = "tacocat taco, cat";
        char o = f.firstUpperCase(l);
        System.out.println(o);
        String kl = f.stringUpperCase(l);
        System.out.println(kl);

        // String nm = l.substring(l.length() - 1, l.length());
        // System.out.println(nm);

    }
}