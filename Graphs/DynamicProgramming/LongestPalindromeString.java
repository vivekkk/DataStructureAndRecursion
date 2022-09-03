
public class LongestPalindromeString {
    
    int lps(String s, int n1,int n2)
    {
     
        if(n1-n2==0 )
        {
            return 1;
        }
        else if(s.charAt(n1)==s.charAt(n2) && (n1-n2==1 || n1-n2==-1 ))
        {
            return 2;
        }
        else if(s.charAt(n1)!=s.charAt(n2) && (n1-n2==1 || n1-n2==-1 ))
        {
            return 1;
        }
      else  if(s.charAt(n1)==s.charAt(n2))
        {
      int option1=2+ lps(s, n1+1, n2-1);
       return option1;
        }
        else{
         int option2= lps(s, n1, n2-1);
         int option3=lps(s,n1+1,n2);
         return (Math.max(option2,option3));
        }
        
    }
    
    public static void main(String arg[])
    {
        String s="ELRMENMET";
        LongestPalindromeString lps=new LongestPalindromeString();
        System.out.println(lps.lps(s, 0, s.length()-1));
        

    }
}
