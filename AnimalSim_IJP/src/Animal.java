/**
 * Animal Class encapsulates a generic animal that can be sub-classed by other classes.
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */

import java.util.*;

public abstract class Animal {

	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	protected Random rand = new Random();//Random instantiated for eat/sleep methods.
	protected double r = rand.nextDouble();
	protected double r1 = rand.nextDouble();
	
	
	/**
	 * empty-argument constructor initializes instance variables
	 * 
	 */
	public Animal(){
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
	}//end empty-argument constructor
	
	
	/**
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l){
		setSimID(simID);
		setLocation(l);
		this.full = false;
		this.rested = true;
		
		
	}//end preferred constructor
	
	
	/**
	 * eat method determines if an animal is full or not. Uses a random number generator to decide.
	 * @return full
	 */
	public boolean eat(){
		
		if (r <= 0.5)
			full = false;
		else
			full = true;
			
			
		return full;
	}//end eat
	

	/**
	 * sleep method determines if an animal is rested or not. Uses a random number generator to decide.
	 * @return rested
	 */
	public boolean sleep(){
		
		if (r1 <= 0.5)
			rested = false;
		else
			rested = true;
			
			
		return rested;
	}//end sleep
	//sleep and rested methods have different variables (r and r1) so they both aren't true or false every time, they can vary.

	
	
	//GETTERS AND SETTERS
	
	/**
	 * @return the simID
	 */
	public int getSimID() {
		return simID;
	}//end getSimID


	public void setSimID(int simID) {
		this.simID = simID;
		
		try {
			if(simID < 0)
				throw new InvalidSimIDException("Sim ID must be greater than 0.");
			else
				setSimID(simID);
			
		}
		catch (InvalidSimIDException isie) {
			System.out.println(isie.getMessage());
		}
		
	}//end setSimID

	
	public Location getLocation() {
		return location;
	}//end getLocation

	
	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation


	public boolean isFull() {
		return full;
	}//end isFull

	
	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	
	public boolean isRested() {
		return rested;
	}//end isRested

	
	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested

	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
	}
}
	