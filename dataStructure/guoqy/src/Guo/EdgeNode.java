package Guo;

/**
 * Clss EdgeNode contains three parameters: weight fromVertex toVertex
 * @author guoqy
 *
 */
public class EdgeNode {
	private int weight;
	private int fromVertex;
	private int toVertex;
	
	public EdgeNode(int weight, int fromVertex, int toVertex){
		
			this.weight = weight;
			this.fromVertex = fromVertex;
			this.toVertex = toVertex;
		
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getFromVertex(){
		return fromVertex;
	}
	
	public int getToVertex(){
		return toVertex;
	}
	
	public String toString(){
		return this.weight+", "+this.fromVertex+", "+this.toVertex;
	}
}
