public class StackminUsingLL{
    Node headStack;
    Node headMin;

    
      public int min() {
        if (headMin !=null)
        {  
        return headMin.value;
        }
        else
        return -1;
      }
    
      public void push(int value) {
        if(headMin==null)
        {
            Node minNode=new Node();
            minNode.value=value;
            minNode.next=null;
            headMin=minNode;
        }
        else
        {
            if(headMin.value>value || headMin.value==value)
            {
                Node minNode=new Node();
                minNode.value=value;
                minNode.next=headMin;
                headMin=minNode;
            }
            


        }

        if(headStack==null)
        {
            Node stackNode=new Node();
            stackNode.value=value;
            stackNode.next=stackNode;
            headStack=stackNode;

        }
        else
        {
            Node stackNode=new Node();
            stackNode.value=value;
            stackNode.next=headStack;
            headStack=stackNode;
                       

        }
      }
    
      public int pop() {
          if(headStack==null)
          {
              System.out.println("The stack is empty");
              return -1;
        }
        else{
            int value=headStack.value;
            if (headMin.value==value && headMin.next!=null)
            {
                headMin=headMin.next;
            }
            headStack=headStack.next;
            System.out.println(" Value poped is "+ value);
            return value;
        }
        
      }

      public static void main (String arg[])
      {
        StackminUsingLL sm=new StackminUsingLL();
        sm.push(8);
        sm.push(2);
        sm.push(-1);
        sm.push(8);
        sm.push(2);
        sm.push(-1);

    //     Node ty=sm.headMin;
    //    do {
    //        System.out.println(ty.value);
    //        ty=ty.next;


    //    } while(ty !=null);
        sm.pop();
        sm.pop();
        sm.pop();
        sm.pop();
        System.out.println(sm.min());  
        sm.pop();
        sm.pop();
        sm.pop();
  


      }
}

class Node
{
 int value;
 Node next;

}
