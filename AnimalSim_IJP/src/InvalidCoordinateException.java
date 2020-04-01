
/**
 * This exception class is to handle when incorrect coordinates are entered.
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */
public class InvalidCoordinateException extends RuntimeException {

	public InvalidCoordinateException(String message){
		super(message);
	}
}//end InvalidCoordinateException