import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {

    public static void main(String arg[]) {
        new Thread(new Runnable() {
            public void run() {

                for (int i = 0; i <= 5; i++) {
                    System.out.println(i);

                }
            }

        }).start();

        Thread t = Thread.currentThread();

        System.out.println(t.getName());
    }

}
