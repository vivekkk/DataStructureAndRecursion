package dataStructureRevison2Hyderabad;

public class ArrayTestAnil {
    
    

    public String[] Sort(String[] a)
    {
        for(int i=0;i<a.length ; i++)
        {
            for(int j=i+1;j<a.length ; j++)
            {
               if(a[i].charAt(0)>a[j].charAt(0))
               {
                 String temp="";
                 temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
               }

            }

        }

         return a;
    }

    public static void  main(String arg[]){
        String[] a={"a","e","h","b","1","2"};
        ArrayTestAnil atn=new ArrayTestAnil();
       String[] s= atn.Sort(a);
        for(int i=0; i<s.length; i++)
        {
          System.out.print(s[i]);

        }

    }
}
