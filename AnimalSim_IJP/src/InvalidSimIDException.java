
/**
 * This exception class handles when an incorrect Sim ID is entered.
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */
public class InvalidSimIDException extends RuntimeException {

	public InvalidSimIDException(String message) {
		super(message);
	}
}//end InvalidSimIDException