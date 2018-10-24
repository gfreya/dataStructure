package Guo;

/**
 * Class OutOfSpaceException extends Class RuntimeException
 * @author guoqy
 *
 */
public class OutOfSpaceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OutOfSpaceException(){
		
	}
	
	public OutOfSpaceException(String message){
		super(message);
	}
}
