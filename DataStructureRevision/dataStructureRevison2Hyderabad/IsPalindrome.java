

public class IsPalindrome {

    public boolean isPalindrome(String s)
    {
    int len;
   len=s.length();
    if( len==1)
    {
        return true;
    }
    else 
    {
     if(s.charAt(0)==s.charAt(len-1))
      {
        //   System.out.println(s.charAt(0) +" and " + s.charAt(len-1));
        //   System.out.println(s.substring(1, s.length()-1));
        System.out.println(s.substring(1, s.length()-1));
        return isPalindrome(s.substring(1, s.length()-1));
      }
     else
      {
          return false;
      
      } 
    }
     }      
    

      public static void main(String args[])
      {
        IsPalindrome isp=new IsPalindrome();
        isp.isPalindrome("tacocat");
        System.out.println(isp.isPalindrome("tacocat"));

      }
}
