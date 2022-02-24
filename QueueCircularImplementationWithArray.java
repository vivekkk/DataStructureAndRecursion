

public class QueueCircularImplementationWithArray {

    public static void main(String args[]) {
        QueueCirclur q=new QueueCirclur(6);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        //q.enqueue(10);
        q.enqueue(13);
    //       for (int a: q.QueueArrayCircular)
    //  {
    //      System.out.println(a);        }

        q.dequeue(); //5

        q.dequeue();//6
        q.dequeue(); //7

        q.enqueue(11);
        q.enqueue(12);
  
        q.peek();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
       
        // for (int a: q.QueueArrayCircular)
        // {
        //     System.out.println(a);        }

    }

}

class QueueCirclur {
    int QueueArrayCircular[];
    int topOfTheQueue;
    int beginingOfTheQueue;

    public QueueCirclur(int size) {
        this.QueueArrayCircular = new int[size];
        this.topOfTheQueue = -1;
        this.beginingOfTheQueue = -1;
        System.out.println("The Queue is created successfully!!");
    }

    public boolean isFull() {
        if ((topOfTheQueue ==QueueArrayCircular.length-1 && beginingOfTheQueue==0) || (topOfTheQueue == beginingOfTheQueue - 1))
            return true;
        else
            return false;
    }

    public boolean isEmpty() {
        if (beginingOfTheQueue==-1)
            return true;
        else
            return false;
    }
    public void enqueue(int value) {
        if(isFull())
        {
            System.out.println("Stack is full");
            return;
        }
        if (isEmpty())
        {
            beginingOfTheQueue=0;
            topOfTheQueue=0;
            QueueArrayCircular[0]=value;
            return;
        }
            else if(topOfTheQueue==QueueArrayCircular.length-1 && beginingOfTheQueue!=0)
            {
                topOfTheQueue=0;
                QueueArrayCircular[0]=value;

            }
            else{
                
                topOfTheQueue++;
                QueueArrayCircular[topOfTheQueue]=value;

            }
                
    }

    public void dequeue()
    {
     if(isEmpty())
     {
         System.out.println("The Queue is empty");
     }
     else if(beginingOfTheQueue==topOfTheQueue)
     {
         System.out.println(QueueArrayCircular[beginingOfTheQueue]);
         topOfTheQueue=-1;
         beginingOfTheQueue=-1;
     }
     else if (beginingOfTheQueue==QueueArrayCircular.length-1 && topOfTheQueue !=beginingOfTheQueue)
     {
        System.out.println(QueueArrayCircular[beginingOfTheQueue]);
        QueueArrayCircular[beginingOfTheQueue]=0;
         beginingOfTheQueue=0;
     }
     else
     {
        System.out.println(QueueArrayCircular[beginingOfTheQueue]);
        beginingOfTheQueue++;


     }

     
    }

    public void peek()
    {
     if(isEmpty())
     {
         System.out.println("The Queue is empty");
     }
     else
     {
        System.out.println(QueueArrayCircular[beginingOfTheQueue]);
        
     }

    }
    
    

    }




