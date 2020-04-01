
/**
 * This exception class handles when an incorrect sub-species is listed.
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */
public class InvalidSubspeciesException extends RuntimeException{

	public InvalidSubspeciesException(String message) {
		super(message);
	}
}//end InvalidSubspeciesException