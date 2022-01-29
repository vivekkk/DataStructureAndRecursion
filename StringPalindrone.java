import java.util.*;
import java.lang.String;

class Trial {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 0 || n < 0) {
            return false;
        } else {
            boolean test = true;
            for (int i = 0; i <= n / 2; i++) {
                if (s.charAt(i) == s.charAt(n - 1 - i)) {
                    test = test && true;
                } else {
                    test = test && false;
                }
            }

            return test;

        }

    }

    public static void main(String ar[]) {
        Trial t = new Trial();

        boolean x = t.isPalindrome("kkkjhjhh");
        System.out.println(x);

    }
}
