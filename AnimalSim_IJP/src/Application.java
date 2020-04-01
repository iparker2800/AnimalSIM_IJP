import java.util.*;
/**
 * Application class tests all Getters, Setters, Methods, Constructors, and Exceptions
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 3
 * Spring Semester 2020
 */
public class Application {

	public static void main(String[] args) {
	
		
		System.out.println("******************************");
		System.out.println("          Location");
		
		Location l = new Location();
		
		l.setxCoord(-1);
		l.setyCoord(5);
		System.out.println("(" +l.getxCoord()+","+l.getyCoord()+")");
		l.update(2, 3);

		System.out.println("Updated coordinates = "+Arrays.toString(l.getCoordinates()));
		System.out.println(l.toString());
		System.out.println("******************************");
		
		
		
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("           Animal");
		
		//Animal a = new Animal(); 
		System.out.println("Cannot instantiate the type Animal because it is abstract.");
		System.out.println("******************************");
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("          Goldfinch");
		Goldfinch g = new Goldfinch();
		
		g.setWingSpan(4.0);
		System.out.println(g.getWingSpan()+"\n");
		g.fly(l);
		g.walk(1);
		System.out.println(g.toString());
		
		
		Animal g1 = new Goldfinch();
		
		System.out.println("full = "+g1.eat());
		System.out.println("rested = "+g1.sleep()+"\n");
		
		g1.setSimID(-1);
		
		g1.setLocation(l);
		System.out.println(g1.getSimID()+"\n");
		System.out.println(g1.getLocation());
		
		System.out.println(g1.toString());
		
		System.out.println("******************************");
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("         Brown Bear");
		BrownBear b = new BrownBear();
		b.walk(-1);
		b.swim(2);
		
		b.setSubSpecies("Black");
		System.out.println(b.getSubSpecies()+"\n");
		System.out.println(b.toString());
		
		
		Animal br = new BrownBear();
		
		System.out.println("full = "+br.eat());
		System.out.println("rested = "+br.sleep()+"\n");
		
		br.setSimID(-1);
		System.out.println(br.getSimID()+"\n");
		br.setLocation(l);
		System.out.println(br.getLocation());
		System.out.println(br.toString());
		System.out.println("******************************");
				}//end main

}//end Application