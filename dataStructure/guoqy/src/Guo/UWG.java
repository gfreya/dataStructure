package Guo;

import java.util.ArrayList;

/**
 * Class UWG which contains an array of vertexNode and an array of EdgeNode
 * @author guoqy
 *
 */

public class UWG {
	private final static int DEFAULT_MAX_VERTICES = 10;
	private final static int DEFAULT_MAX_EDGES = 20;
	private VertexNode[] vertexNodes;
	private EdgeNode[] edgeNodes;
	private int firstFreeVertex = 0;
	private int firstFreeEdge = 0;
	
	public UWG(){
		vertexNodes = new VertexNode[DEFAULT_MAX_VERTICES];
		edgeNodes = new EdgeNode[DEFAULT_MAX_EDGES];
	}
	
	//declare array of fixed size
	public UWG(int vertexSize, int edgeSize){
		vertexNodes = new VertexNode[vertexSize];
		edgeNodes = new EdgeNode[edgeSize];
	}
	
	public int getNumVertices(){
		return firstFreeVertex;
	}
	
	public int getNumEdges(){
		return firstFreeEdge;
	}
	
	//insert vertexNode
	public void insertVertex(String name){
		if(firstFreeVertex==vertexNodes.length){
			throw new OutOfSpaceException("full.");
		}
		VertexNode vertexNode = new VertexNode(name);
		vertexNodes[firstFreeVertex] = vertexNode;
		firstFreeVertex++;
		return;
	}
	
	//insert edgeNode
	public void insertEdge(int weight, String fromVertex, String toVertex){
		int fromVertexIndex=-1;
		int toVertexIndex=-1;
		if(firstFreeEdge == edgeNodes.length){
			throw new OutOfSpaceException("full");
		}
		VertexNode node = new VertexNode(fromVertex);
		VertexNode node2 = new VertexNode(toVertex);
		for(int i=0; i<getNumVertices();i++){
			if(vertexNodes[i].equals(node)){
				fromVertexIndex = i;
			}
			if(vertexNodes[i].equals(node2)){
				toVertexIndex = i;
			}
		}
		EdgeNode edgeNode = new EdgeNode(weight, fromVertexIndex, toVertexIndex);
		edgeNodes[firstFreeEdge] = edgeNode;
		firstFreeEdge++;
		return;
	}
	
	public String toString(){
		String string = "firstFreeVertex = "+this.getNumVertices()+"\n"+"firstFreeEdge = "+this.getNumEdges()+"\n";
		string=string +"\n"+"Vertices : \n";
		for(int i=0;i<firstFreeVertex;i++){
			string+=i+" : "+vertexNodes[i].toString()+"\n";
		}
		string=string+"\n"+"Edges : \n";
		for(int j=0;j<firstFreeEdge;j++){
			string+=j+" : "+edgeNodes[j].toString()+"\n";
		}
		
		return string;
	}
	
	//get the degree of a vertexNode
	public int degree(String name){
		int vertexindex=-1;
		int sum=0;
		VertexNode vertexNode = new VertexNode(name);
		for(int i=0;i<firstFreeVertex;i++){
			if(vertexNodes[i].equals(vertexNode)){
				vertexindex = i;
			}
		}
		for(int j=0;j<firstFreeEdge;j++){
			int a = edgeNodes[j].getFromVertex();
			int b = edgeNodes[j].getToVertex();
			if(a==vertexindex){
				sum++;
			}
			if(b==vertexindex){
				sum++;
			}
		}
		return sum;
	}
	
	//get the total weight of the path
	public int totalPathWeight(ArrayList<String> path){
		int[] vertices = new int[10];
		int total =0;	
		for(int i=0;i<path.size();i++){
			for(int j=0;j<getNumVertices();j++){
				if(vertexNodes[j].toString().equals(path.get(i))){
					vertices[i] = j;
					break;
				}else{
					vertices[i]=-1;
				}
			}
		}	
		//throw illegalArgumentException
		for(int k=0;k<path.size();k++){
			if(vertices[k]<0){
				throw new IllegalArgumentException();
			}
		}	
		for(int p=0;p<path.size()-1;p++){
			for(int q=0;q<getNumEdges();q++){
				if(edgeNodes[q].getFromVertex()== vertices[p]){
					if(edgeNodes[q].getToVertex() == vertices[p+1]){
							total+=edgeNodes[q].getWeight();
							break;
					}
				}
			}			
		}	
		return total;
	}
	
	//find minimum edge of the graph when the arrayList vertices is empty
	public Edge findMinEdge(ArrayList<String> vertices){
		if(vertices.size()==0){
			EdgeNode node=edgeNodes[0];
			for(int i=0;i<getNumEdges();i++){
				if(edgeNodes[i].getWeight()<node.getWeight()){
					node = edgeNodes[i];
				}
			}
			Edge edge = new Edge(node.getWeight(),vertexNodes[node.getFromVertex()].toString(), vertexNodes[node.getToVertex()].toString());
			return edge;
			}
		return null;
	}
}
