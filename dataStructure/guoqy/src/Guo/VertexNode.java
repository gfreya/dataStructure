package Guo;

/**
 * Class VertexNode which has a parameter: name
 * @author guoqy
 *
 */
public class VertexNode {
	private String name;
	
	public VertexNode(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object otherNode){
		if(this.toString().equals(otherNode.toString())){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return this.name;
	}
}
