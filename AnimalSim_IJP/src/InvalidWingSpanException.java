
/**
 * This exception class handles when an incorrect wing span is entered.
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */
public class InvalidWingSpanException extends RuntimeException{

	public InvalidWingSpanException(String message) {
		super(message);
	}
}//end InvalidWingSpanException