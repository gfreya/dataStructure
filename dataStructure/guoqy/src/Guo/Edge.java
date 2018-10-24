package Guo;

/**
 * Class Edge which contains three parameters: weight fromVertex toVertex 
 * @author guoqy
 *
 */
public class Edge {
	private int weight;
	private String fromVertex;
	private String toVertex;
	

	public Edge(int weight,String fromVertex, String toVeretex){
		this.weight = weight;
		this.fromVertex = fromVertex;
		this.toVertex = toVeretex;
	}
	
	
	public int getWeight(){
		return this.weight;
	}
	
	
	public String getFromVertex(){
		return this.fromVertex;
	}
	
	
	public String getToVertex(){
		return this.toVertex;
	}
}
