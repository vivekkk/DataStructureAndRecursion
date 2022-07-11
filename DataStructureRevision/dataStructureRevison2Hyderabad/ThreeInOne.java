import javax.lang.model.util.ElementScanner14;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;
    private int[] indexOfTopofStacks;
  
    public ThreeInOne(int stackSize) {
    this.stackCapacity=stackSize;
    sizes=new int[6];
    sizes[0]=0; 
    sizes[1]=stackCapacity/3-1;
    sizes[2]=stackCapacity/3;
    sizes[3]=2*stackCapacity/3-1;
    sizes[4]=2*stackCapacity/3;
    sizes[5]=stackCapacity-1;
    this.values=new int[stackCapacity];
    this.indexOfTopofStacks=new int[numberOfStacks];
    indexOfTopofStacks[0]=-1;
    indexOfTopofStacks[1]=-1;
    indexOfTopofStacks[2]=-1;
    }
  
    // isFull
    public boolean isFull(int stackNum) throws IndexOutOfBoundsException {
      if(indexOfTop(stackNum)==stackCapacity/3-1)
      {
       return true;
      }
      else 
        if( indexOfTop(stackNum)==2*stackCapacity/3-1)
      {
       return true;
      }
      else if (indexOfTop(stackNum)==stackCapacity-1)
      {
       return true;
      }
      else 
      {
       return false;
      }
     
    }
  
    // isEmpty
    public boolean isEmpty(int stackNum) throws IndexOutOfBoundsException{
       if(indexOfTop(stackNum)==-1)
       {
        return true;
       }
       else 
       {
        return false;
       }      
      
        
    }
  
    // indexOfTop - this is helper method for push, pop and peek methods
  
    private int indexOfTop(int stackNum)  {
       if(stackNum==1)
       {
            return indexOfTopofStacks[0];
      
       }
       if(stackNum==2)
       {
            return indexOfTopofStacks[1];
      
       }
       if(stackNum==3)
       {
            return indexOfTopofStacks[2];
      
       }
       else return -1;
     
      // TODO
    }
  
    // push
    public void push(int stackNum, int value) {
      if(isFull(stackNum))
      {
        System.out.println("The stack "+ stackNum +"is full so cannot push values;");
      }
      else
      
      if(isEmpty(stackNum)){
        
        if(stackNum==1)
        {
          indexOfTopofStacks[stackNum-1]=sizes[0];
          values[0]=value;
         }
         else if(stackNum==2)
         {
          indexOfTopofStacks[stackNum-1]=sizes[2];
          values[sizes[2]]=value;
         }
         else{
          indexOfTopofStacks[stackNum-1]=sizes[4];
          values[sizes[4]]=value;
         }

      }
      else 
      {
        indexOfTopofStacks[stackNum-1]=indexOfTopofStacks[stackNum-1]+1;
        values[indexOfTop(stackNum)]=value;
      }
     
      
    }
  
    // pop
    public int pop(int stackNum) {
      if(isEmpty(stackNum))
      {
        System.out.println("The stack" + stackNum +" is empty could not pop");
        return -1;
      }
      else
      {

        int value= values[indexOfTop(stackNum)];
        indexOfTopofStacks[stackNum-1]=indexOfTopofStacks[stackNum-1]-1;
        System.out.println("the value pop from the stack no: "+  stackNum+ " is "+value);
        return value;
        
      }
    }
  
    // peek
  
    public int peek(int stackNum) {
      if(isEmpty(stackNum))
      {
        System.out.println("The stack" + stackNum +" is empty could not pop");
        return -1;
      }
      else
      {

       
        return values[indexOfTop(stackNum)];
        
      }
    }

    public static void main(String arg[])
    {
      ThreeInOne q=new ThreeInOne(9);
     System.out.println(q.isEmpty(1)); 
      System.out.println(q.isFull(1));
      q.push(1, 10);
      q.push(1, 11);
      q.push(1, 12);
      q.push(1, 14);
      q.push(2, 22);
      q.push(3, 33);
     System.out.println(q.pop(1));   
      q.push(1, 14);
      q.push(2, 44);
      q.push(3, 66);
      q.push(2, 88);
      q.push(3, 99);
      q.push(2, 46);
      q.push(3, 67);
      System.out.println(q.pop(1)); 
      System.out.println(q.pop(2)); 
      System.out.println(q.pop(3)); 
      System.out.println(q.pop(2)); 
      System.out.println(q.pop(3)); 

    }
    }
  
  
  