import java.lang.String;

import javax.lang.model.util.ElementScanner14;

public class ConverOneStringToAnother {


    // tHIS PROGRAM CONVERTS ONE STRING TO ANOTHER BUT DOES NOT CATER A OPTIOMUM SOLUTION FOR MINIMUM NO
    public int OneToAnother(StringBuffer s2, StringBuffer s1, int inds2, int inds1, int count)
            throws java.lang.IndexOutOfBoundsException {

        if (s2.charAt(inds2) != s1.charAt(inds1) && s1.length() > s2.length()) {
            s2.insert(inds2, s1.charAt(inds1));
            count = count + 1;
            if (inds1 + 1 >= s1.length()  || inds2 + 1 >= s2.length() ) {
                return count;
            } else {
                return  OneToAnother(s2, s1, inds2 + 1, inds1 + 1, count);

            }

        } else if (s2.charAt(inds2) != s1.charAt(inds1) && s1.length() < s2.length()) {
            s2.deleteCharAt(inds2);
            count = count + 1;
            if (inds1 + 1 >= s1.length() ) {
                return count;
            } else {
                return  OneToAnother(s2, s1, inds2, inds1 + 1, count);
            }

        } else if (s2.charAt(inds2) != s1.charAt(inds1)) {
            s2.replace(inds2, inds2+1, String.valueOf(s1.charAt(inds1)));
            count = count + 1;
            if (inds1 + 1 >= s1.length()  || inds2 + 1 >=s2.length() ) {
                return count;
            } else {
                return  OneToAnother(s2, s1, inds2 + 1, inds1 + 1, count);
            }

        } else {
            if (inds1 + 1 >= s1.length()  || inds2 + 1 >= s2.length() ) {
                return count;
            } else 
            {
            return OneToAnother(s2, s1, inds2 + 1, inds1 + 1, count);
            }
        }

    }

    public static void main(String arg[]) {
        ConverOneStringToAnother costa = new ConverOneStringToAnother();
        StringBuffer s1 = new StringBuffer("testtest");
        StringBuffer s2 = new StringBuffer("test");
         
        System.out.println(costa.OneToAnother(s2, s1, 0, 0, 0));
    }
}
