class StackMin{

    int stackArray[];
    int offSet;
    int min[];
    int minoffset;
  

    public StackMin(int size)
    {   
        this.stackArray=new int[size];
        this.offSet=-1;
        this.min=new int[size];
        this.minoffset=0;
        

    }

     public void push(int value){
         if (offSet==stackArray.length-1)
         {
             
             System.out.println("The array is full");
             return;
         }
         else{
             if(offSet==-1)
             {
               min[0]=value;
             }
             else if(value < min[minoffset])
             {min[minoffset+1] =value;
                minoffset++;
            }
             
       stackArray[offSet+1]=value;
       offSet=offSet+1;
       System.out.println("Value "+ value +" is pushed in the Array");     
         } 
     }

     public void pop()
     {
        if(stackArray[offSet]==min[minoffset] & minoffset !=0 & offSet !=-1)
        {
            minoffset--;

        }
         if (offSet==-1)
         {
             System.out.println("The stack is empty");
            
         }

         else if(offSet==0)
         {
             System.out.println("Value "+ stackArray[0]+ " is pop out");
             offSet=-1;

         }else{
            

            System.out.println("Value "+ stackArray[offSet]+ " is pop out");
             offSet--;
             

         }
     }

     public void stackmin()
     {
       System.out.println(min[minoffset]);


     }

     public static void main (String args[])
     {
        StackMin s= new StackMin(5);
        s.push(0);
        s.stackmin();
        s.push(-2);
        s.stackmin();
        s.push(-1);
       s.stackmin();
        s.push(6);
        s.stackmin();
        s.push(-6);
        s.stackmin();
        s.push(-6);
        s.push(6);
        s.pop();
        s.stackmin();
        s.pop();
        s.stackmin();
        s.pop();
        s.stackmin();
        s.pop();
        s.stackmin();
        s.pop();
        s.stackmin();
 


     }
}