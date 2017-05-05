package javaAssessmentBoat;

import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Test;


public class BoatTest {
	
	//Tests to see if captain can be added if they are already crew or not
	
	@Test public void setCaptain1()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Person testingPerson2 = new Person("Richard", "Richard", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		testingBoat.addCrew(testingPerson1);
		
		assertEquals("Person set as captain", testingBoat.setCaptain(testingPerson2));
	}
	
	@Test public void setCaptain2()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		testingBoat.addCrew(testingPerson1);
		
		assertEquals("Cannot make captain, already Crew", testingBoat.setCaptain(testingPerson1));
	}
	
	//Tests to see if crew can be added whilst they exist as captain or not
	
	@Test public void addCrew1()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Person testingPerson2 = new Person("Richard", "Richards", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		testingBoat.addCrew(testingPerson1);
		
		assertEquals("Person added to Crew", testingBoat.addCrew(testingPerson2));
	}
	
	@Test public void addCrew2()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Person testingPerson2 = new Person("Richard", "Richards", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		testingBoat.setCaptain(testingPerson1);
		
		assertEquals("Cannot make crew, already Captain", testingBoat.addCrew(testingPerson1));
	}

	//Tests to see if check of assisgned people returns true or false correctly
	
	@Test public void boatHasAssingedPerson1()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		
		testingBoat.addCrew(testingPerson1);
		
		assertTrue(testingBoat.boatHasAssingedPerson());
	}
	
	@Test public void boatHasAssingedPerson2()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		
		testingBoat.addOwner(testingPerson1);
		
		assertTrue(testingBoat.boatHasAssingedPerson());
	}
	
	@Test public void boatHasAssingedPerson3()
	{
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
				
		testingBoat.setCaptain(testingPerson1);
		
		assertTrue(testingBoat.boatHasAssingedPerson());
	}
	
	@Test public void boatHasAssingedPerson4()
	{
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);

		assertFalse(testingBoat.boatHasAssingedPerson());
		
	}
}
