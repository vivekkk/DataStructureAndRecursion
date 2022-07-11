public class ReverseOfString {
    
    public String reverseOfString(String s, int length)
    {
        if(length<0)
        {
            return "";
        }
        else 
        {
            return s.charAt(length)  + reverseOfString(s, length-1);
        }

    }

    public static void main(String args[])
    {
       ReverseOfString r=new ReverseOfString();
       String s=r.reverseOfString(args[0],  Integer.parseInt(args[1]));
       System.out.println(s);

    }
}


