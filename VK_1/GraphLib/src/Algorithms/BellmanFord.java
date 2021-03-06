package Algorithms;

import Structures.Graph.Edge;
import Structures.Graph.Graph;
import Structures.Graph.Vertex;
import Structures.LinkedList.LinkedList;
import Structures.Hashtable.Hashtable;
import Structures.Stack.Stack;
import Utils.Iterator;

/**
* Bellman-Ford algorithm for finding the shortest path between vertex a and b. Works with any graph but recommended only for a graph that has negative weights
*/

public class BellmanFord extends PathFinder{
    private Graph graph;
    public BellmanFord(Graph graph){
        super(graph);
        this.graph=graph;
    }

    @Override
    public Path shortestPath(Vertex a, Vertex b) {
        Hashtable<Vertex,Integer> distance=new Hashtable<Vertex,Integer>(graph.getVertices().size()*2);
        Hashtable<Vertex,Vertex> path=new Hashtable<Vertex,Vertex>(graph.getVertices().size()*2);
        Iterator<Vertex> r = new Iterator<Vertex>(graph.getVertices());
        int vertices=0;
        while(r.hasNext()){
            Vertex v = r.getNext();
            distance.put(v, Integer.MAX_VALUE-10000);
            path.put(v, null);
            vertices++;
        }
        distance.put(a,0);
        for(int i=1; i<vertices-1; i++){
            LinkedList<Edge> weight = graph.getWeights().keySet();
            Iterator<Edge> t = new Iterator<Edge>(weight);
            while(t.hasNext()){
                Edge e = t.getNext();
                super.relax(e.getA(),e.getB(),distance,path);
            }
        }
        return super.getPath(a,b,path,distance);
    }
}
