package javaAssessmentBoat;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class MarinaTest {
	
	@Test public void addBoat1a()
	{
		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		testingBoat.addCrew(testingPerson1);
		
		assertEquals("Boat added", testingMarina1.addBoat(testingBoat));		
	}
	

	
	@Test public void addBoat1b()
	{
		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 298.0);
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingMarina1.addBoat(testingBoat1);
		
		assertEquals("Boat added", testingMarina1.addBoat(testingBoat2));		
	}
	
	@Test public void addBoat2()
	{
		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);

		
		assertEquals("No person assigned to boat, cannot register boat to Marina", testingMarina1.addBoat(testingBoat));
		
	}
	@Test public void addBoat3()
	{
		Marina testingMarina1 = new Marina("Marina A", "The Port", 15.0);
		Boat testingBoat = new Boat("Big Boat", "Japan", 20.0);

		
		assertEquals("Not enough space in Marina, cannot register boat to Marina", testingMarina1.addBoat(testingBoat));
		
	}
	@Test public void addBoat4()
	{
		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 300.0);
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingMarina1.addBoat(testingBoat1);
		
		assertEquals("Not enough space in Marina, cannot register boat to Marina", testingMarina1.addBoat(testingBoat2));	
		
	}

}
