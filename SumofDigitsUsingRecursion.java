
import java.util.*;

import javax.lang.model.util.ElementScanner14;

class SumofDigitsUsingRecursion {
    int sum(int n) {
        if (n != 0) {
            if (n < 0) {
                n = -1 * (n);
            }
            return n % 10 + sum(n / 10);
        } else {
            return 0;

        }

    }

    public static void main(String args[]) {

        SumofDigitsUsingRecursion d = new SumofDigitsUsingRecursion();
        int x = d.sum(-895662);
        System.out.println(x);

    }

}