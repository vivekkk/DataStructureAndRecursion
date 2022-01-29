
import java.util.*;

import javax.lang.model.util.ElementScanner14;

class FibnocciSeries
{
    int sum(int n)
        {
        if (n !=0)
        {
			return n%10 + sum(n/10);
        }
        else {
			return 0;
        
        }
	
    
    }
    

public static void main (String args[])
{

    FibnocciSeries d=new FibnocciSeries();
    int x=d.sum(-2569);
    System.out.println(x);

}

}