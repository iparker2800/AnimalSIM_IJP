
/**
 * Goldfinch Class is a subclass of Animal.
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */
public class Goldfinch extends Animal implements Flyable, Walkable {

	private double wingSpan;
	
	
	public Goldfinch() {
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
		wingSpan = 9.0;
		
	}//end empty-argument constructor
	
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		setSimID(simID);
		setLocation(l);
		setWingSpan(wingSpan);
		this.full = false;
		this.rested = true;
		
			
	}//end preferred constructor

	
	
	public void fly(Location l) {
		location = new Location(this.location.xCoord, this.location.yCoord);
	}//end fly
	
	
	public void walk(int direction) {
		
		switch(direction) {
		
		//up
		case 1:
			this.location.yCoord = this.location.yCoord+1;
			break;
			
		//down
		case -1:
			this.location.yCoord = this.location.yCoord-1;
			break;
			
		//right
		case 2:
			this.location.xCoord = this.location.xCoord+1;
			break;
			
		//left	
		case -2:
			this.location.xCoord = this.location.xCoord-1;
			break;
		
		default:
			
		}//end switch
	}//end walk
	
	
	
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;

		try {
			if(wingSpan <= 5.0 || wingSpan >= 11.0)
				throw new InvalidWingSpanException("Wing span needs to be between 5cm and 11cm.");
			else
				setWingSpan(wingSpan);
			
		}
		catch (InvalidWingSpanException iwse) {
			System.out.println(iwse.getMessage());
		}
	}//end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + "]";
	}//end toString
	
}//end Goldfinch