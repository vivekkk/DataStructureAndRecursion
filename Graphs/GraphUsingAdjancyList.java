import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphUsingAdjancyList {

    public static void main(String arg[])
    {
        ArrayList<GraphNode> listofNodes=new ArrayList<>();
        listofNodes.add(new GraphNode("A", 0));
        listofNodes.add(new GraphNode("B", 1));
        listofNodes.add(new GraphNode("C", 2));
        listofNodes.add(new GraphNode("D", 3));
        listofNodes.add(new GraphNode("E", 4));
        listofNodes.add(new GraphNode("F", 5));
        listofNodes.add(new GraphNode("G", 6));
        
        Graph g= new Graph(listofNodes);
        g.assignNeighbours(0, 1);
        g.assignNeighbours(0, 2);
        g.assignNeighbours(1, 3);
        g.assignNeighbours(1, 6);
        g.assignNeighbours(2, 3);
        g.assignNeighbours(2, 4);
        g.assignNeighbours(3, 5);
        g.assignNeighbours(4, 5);
        g.assignNeighbours(5, 6);


      System.out.println(g);

      g.BFSAdjancyList();
/*       for (GraphNode graphNode : listofNodes) {
        System.out.println(graphNode.name +":");
        for (GraphNode neighbour : graphNode.neighbors) {
          System.out.print(neighbour.name+" ");
          
        }
      } */

    }
    
}

class GraphNode{
    String name;
    int index;
    boolean isVisited=false;
    ArrayList<GraphNode> neighbors= new ArrayList<>();

    public GraphNode(String name, int index){
    this.name=name;
    this.index=index;

    }
    
}

class Graph{
 ArrayList<GraphNode> nodeList=new ArrayList<>();

 public Graph(ArrayList<GraphNode> nodes)
 {
  this.nodeList=nodes;
  
 }

 public void assignNeighbours(int i, int j)
{ 
    GraphNode node1=nodeList.get(i);
    GraphNode node2=nodeList.get(j);
    nodeList.get(i).neighbors.add(node2);
    nodeList.get(j).neighbors.add(node1);
  
 }

 public String toString()
 {
     StringBuilder s=new StringBuilder();
     for(int i=0; i<nodeList.size(); i++)
     {
        s.append(nodeList.get(i).name);
        s.append(": ");
    for(int j=0; j<nodeList.get(i).neighbors.size(); j++)
    {
        s.append(nodeList.get(i).neighbors.get(j).name);
        s.append(" ->");
    }
        s.append("\n");
         
     }
     return s.toString();
 }

 public void BFSAdjancyList()
 {
    Queue<GraphNode> q=new LinkedList<>();
    q.add(nodeList.get(0));

    while(!q.isEmpty())
    {  
        GraphNode g=q.remove();
       if(g.isVisited==false){
          System.out.print(g.name+" ");
          g.isVisited=true;
        }        
           for(GraphNode e : g.neighbors)
            {
              if(!e.isVisited)
              {
               q.add(e);
              }
            }   
    }

 }

/*  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
        if (j == nodeList.get(i).neighbors.size()-1 ) {
          s.append((nodeList.get(i).neighbors.get(j).name) );
        } else {
          s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
        }
      }
      s.append("\n");
    }
    return s.toString();
  } */

}
