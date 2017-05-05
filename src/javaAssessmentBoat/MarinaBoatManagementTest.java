package javaAssessmentBoat;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class MarinaBoatManagementTest {
	
	@Test public void addBoat1()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		
		assertEquals("Boat added", TYHA.addBoat(testingBoat));		
	}
	
	@Test public void addBoat2()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Boat testingBoat = new Boat("Big Boat", "Japan", 2.0);
		TYHA.addBoat(testingBoat);
		
		assertEquals("Boat already exists, not added", TYHA.addBoat(testingBoat));		
	}
	
	@Test public void addPerson1()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		
		assertEquals("Person added", TYHA.addPerson(testingPerson1));		
	}
	
	@Test public void addPerson2()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Person testingPerson2 = new Person("Gareth", "Person", Date.valueOf("1983-01-27"), "British");
		TYHA.addPerson(testingPerson1);
		
		assertEquals("Person added", TYHA.addPerson(testingPerson2));		
	}
	
	@Test public void addPerson3()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		TYHA.addPerson(testingPerson1);
		
		assertEquals("Person already exists, not added", TYHA.addPerson(testingPerson1));		
	}
	
	@Test public void addPerson4()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Person testingPerson2 = new Person("Gareth", "Person", Date.valueOf("1983-01-27"), "British");
		TYHA.addPerson(testingPerson1);
		TYHA.addPerson(testingPerson2);
		
		assertEquals("Person already exists, not added", TYHA.addPerson(testingPerson2));		
	}
	
	@Test public void isBoatAlreadyAssigned1()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Marina testingMarina2 = new Marina("Marina A", "The Port", 300);
		
		TYHA.addMarina(testingMarina1);
		TYHA.addMarina(testingMarina2);
		
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 2.0);
		Boat testingBoat3 = new Boat("Biggerest Boat", "America", 2.0);
		Boat testingBoat4 = new Boat("Best Boat", "UK", 2.0);
		
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingBoat3.addCrew(testingPerson1);
		testingBoat4.addCrew(testingPerson1);
		
		testingMarina1.addBoat(testingBoat1);
		testingMarina1.addBoat(testingBoat2);
		testingMarina2.addBoat(testingBoat3);
		
		assertTrue(TYHA.isBoatAlreadyAssigned(testingBoat3));		
	}
	
	@Test public void isBoatAlreadyAssigned3()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Marina testingMarina2 = new Marina("Marina A", "The Port", 300);
		
		TYHA.addMarina(testingMarina1);
		TYHA.addMarina(testingMarina2);
		
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 2.0);
		Boat testingBoat3 = new Boat("Biggerest Boat", "America", 2.0);
		Boat testingBoat4 = new Boat("Best Boat", "UK", 2.0);
		
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingBoat3.addCrew(testingPerson1);
		testingBoat4.addCrew(testingPerson1);
		
		
		assertFalse(TYHA.isBoatAlreadyAssigned(testingBoat3));		
	}
	
	@Test public void isBoatAlreadyAssigned4()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Marina testingMarina2 = new Marina("Marina A", "The Port", 300);
		
		TYHA.addMarina(testingMarina1);
		TYHA.addMarina(testingMarina2);
		
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 2.0);
		Boat testingBoat3 = new Boat("Biggerest Boat", "America", 2.0);
		Boat testingBoat4 = new Boat("Best Boat", "UK", 2.0);
		
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingBoat3.addCrew(testingPerson1);
		testingBoat4.addCrew(testingPerson1);
		
		testingMarina1.addBoat(testingBoat1);
		testingMarina1.addBoat(testingBoat2);
		testingMarina2.addBoat(testingBoat3);
		
		assertFalse(TYHA.isBoatAlreadyAssigned(testingBoat4));		
	}
	
	
	@Test public void assignBoatToMarina1()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Marina testingMarina2 = new Marina("Marina A", "The Port", 300);
		
		TYHA.addMarina(testingMarina1);
		TYHA.addMarina(testingMarina2);
		
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 2.0);
		Boat testingBoat3 = new Boat("Biggerest Boat", "America", 2.0);
		Boat testingBoat4 = new Boat("Best Boat", "UK", 2.0);
		
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingBoat3.addCrew(testingPerson1);
		testingBoat4.addCrew(testingPerson1);
		
		testingMarina1.addBoat(testingBoat1);
		testingMarina1.addBoat(testingBoat2);
		testingMarina2.addBoat(testingBoat3);
		
		assertEquals("Boat added",TYHA.assignBoatToMarina(testingBoat4, testingMarina1));		
	}
	
	@Test public void assignBoatToMarina2()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Marina testingMarina2 = new Marina("Marina A", "The Port", 300);
		
		TYHA.addMarina(testingMarina1);
		TYHA.addMarina(testingMarina2);
		
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 2.0);
		Boat testingBoat3 = new Boat("Biggerest Boat", "America", 2.0);
		Boat testingBoat4 = new Boat("Best Boat", "UK", 2.0);
		
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingBoat3.addCrew(testingPerson1);
		testingBoat4.addCrew(testingPerson1);
		
		testingMarina1.addBoat(testingBoat1);
		testingMarina1.addBoat(testingBoat2);
		testingMarina2.addBoat(testingBoat3);
		
		assertEquals("Boat is already assigned to a Marina. Boat not assisgned",TYHA.assignBoatToMarina(testingBoat3, testingMarina1));		
	}
	
	@Test public void assignBoatToMarina3()
	{
		MarinaBoatManagement TYHA = new MarinaBoatManagement();

		Marina testingMarina1 = new Marina("Marina A", "The Port", 300);
		Marina testingMarina2 = new Marina("Marina A", "The Port", 300);
		
		TYHA.addMarina(testingMarina1);
		TYHA.addMarina(testingMarina2);
		
		Person testingPerson1 = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");
		Boat testingBoat1 = new Boat("Big Boat", "Japan", 2.0);
		Boat testingBoat2 = new Boat("Bigger Boat", "China", 2.0);
		Boat testingBoat3 = new Boat("Biggerest Boat", "America", 2.0);
		Boat testingBoat4 = new Boat("Best Boat", "UK", 2.0);
		
		testingBoat1.addCrew(testingPerson1);
		testingBoat2.addCrew(testingPerson1);
		testingBoat3.addCrew(testingPerson1);
		
		testingMarina1.addBoat(testingBoat1);
		testingMarina1.addBoat(testingBoat2);
		testingMarina2.addBoat(testingBoat3);
		
		assertEquals("No person assigned to boat, cannot register boat to Marina",TYHA.assignBoatToMarina(testingBoat4, testingMarina1));		
	}

}
