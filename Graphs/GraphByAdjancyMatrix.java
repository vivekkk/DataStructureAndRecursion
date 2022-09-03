import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphByAdjancyMatrix{

    public static void main(String arg[])
    {
        ArrayList<GraphNode> list=new ArrayList<GraphNode>();
        list.add(new GraphNode("A", 0));
        list.add(new GraphNode("B", 1));
        list.add(new GraphNode("C", 2));
        list.add(new GraphNode("D", 3));
        list.add(new GraphNode("E", 4));
        Graph g=new Graph(list);
        g.addUndirectedNode(0, 1);
        g.addUndirectedNode(0, 2);
        g.addUndirectedNode(0, 3);
        g.addUndirectedNode(2, 3);
        g.addUndirectedNode(3, 4);
        g.addUndirectedNode(1, 4);
        System.out.println(g.toString());
        g.BFSAdjancyMatrix();
    }


}


class Graph{
     
    ArrayList<GraphNode> list;
    int[][] adjancyMatrix;
    
    

    public Graph(ArrayList<GraphNode> list )
    { 
        this.list=list;
        this.adjancyMatrix=new int[list.size()][list.size()];

    }

    public void addUndirectedNode(int i, int j)
    {
        adjancyMatrix[i][j]=1;
        adjancyMatrix[j][i]=1;
    }

    public void BFSAdjancyMatrix()
    {
      Queue<GraphNode> q= new LinkedList<GraphNode>();
      q.add(list.get(0));
      int i=0;
      while(!q.isEmpty())
      {
        GraphNode g=q.remove();
      if(g.isVisited==false)
      {
        System.out.print(g.name+"->");
        g.isVisited=true;
        for(int j=0;j<adjancyMatrix[i].length;j++)
        {
          if(adjancyMatrix[i][j]==1 && list.get(j).isVisited==false) 
          {
            q.add(list.get(j));
          }

        }
      }
      i=i+1;
      }


    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < list.size(); i++) {
          s.append(list.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < list.size(); i++) {
          s.append(list.get(i).name + ": ");
          for (int j : adjancyMatrix[i]) {
            s.append((j) + " ");
          }
          s.append("\n");
        }
        return s.toString();
      }


}

class GraphNode{
    String name;
    int index;
    boolean isVisited=false;

    public  GraphNode(String name, int index){
        this.name=name;
        this.index=index;
           }
}