    import java.util.*;

    import javax.lang.model.util.ElementScanner14;

    class GcdOfTwoNumbers {
        int gcd(int a, int b) {
    if(a<0 || b<0)
            {

                return -1;
            } i
                
                return a;
            }

            else 
            {
            return gcd(b,a%b);   
            }
    
        }

        public static void main(String args[]) {

            GcdOfTwoNumbers d = new GcdOfTwoNumbers();
            int x = d.gcd(48,5);
            System.out.println(x);

        }

    }