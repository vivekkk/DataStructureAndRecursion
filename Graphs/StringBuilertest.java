import java.util.ArrayList;

public class StringBuilertest {



    
}


class GraphNode{
    String name;
    int index;
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

 public String toString()
 {
     StringBuilder s=new StringBuilder();
     for(int i=0; i<nodeList.size(); i++)
     {
        s.append(nodeList.get(i));
        s.append(": ");
    for(int j=0; j<nodeList.get(i).neighbors.size(); j++)
    {
        s.append(nodeList.get(i).neighbors.get(j));
        s.append(" ->");
    }
        s.append("\n");
         
     }
     return s.toString();
 }

}