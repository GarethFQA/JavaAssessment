package javaAssessmentBoat;

import java.util.ArrayList;
import java.util.Iterator;

public class Boat implements Vehicle {
	
	String name;
	String countryOfOrigin;
	double size;
	int speed;
	Person captain = null;
	ArrayList<Person> crew = new ArrayList<Person>();
	ArrayList<Person> owners = new ArrayList<Person>();
	
	public Boat(String name, String country, double size)
	{
		this.name = name;
		this.countryOfOrigin = country;
		this.size = size;
		this.speed = 0;
	}
	
	public boolean boatHasAssingedPerson()
	{
		//checks if any crew, owners or captain are assigned
		if (captain != null)
		{
			return true;
		}
		if (crew.size() > 0)
		{
			return true;
		}
		if (owners.size() > 0)
		{
			return true;
		}

		
		return false;
		
	}
	public String addCrew(Person crewMember)
	{
		//Checks to see if Person is already the captain, if not adds to crew, if already captain does not add to crew, string returns result of check
			if (crewMember == this.captain)
			{
				return "Cannot make crew, already Captain";
			}
					
		crew.add(crewMember);
		return "Person added to Crew";
	}
	
	public void addOwner(Person crewMember)
	{
		crew.add(crewMember);
		return;
	}
	
	public void removeCrew(Person crewMember)
	{
		crew.remove(crewMember);
		return;
	}
	
	public void removeOwner(Person crewMember)
	{
		crew.remove(crewMember);
		return;
	}
	
	

	public ArrayList<Person> getCrew() {
		return crew;
	}


	public void setCrew(ArrayList<Person> crew) {
		this.crew = crew;
	}


	public ArrayList<Person> getOwners() {
		return owners;
	}


	public void setOwners(ArrayList<Person> owners) {
		this.owners = owners;
	}


	public Person getCaptain() {
		return captain;
	}


	public String setCaptain(Person captain) {
		//Checks to see if person is already member of crew, if not in crew sets as captain, if in crew does not set as captain. String returns result of check.
		Iterator<Person> iterator = crew.iterator();
		while(iterator.hasNext())
		{
			Person currentCrew = iterator.next();
			if (currentCrew == captain)
			{
				return "Cannot make captain, already Crew";
			}
			
		}
		this.captain = captain;
		return "Person set as captain";
	}

	public void removeCaptain() {
		captain = null;
		return;
	}
	
	public int getSpeed() {

		return this.speed;
	}


	public void accelerate() {

		
	}


	public void deccelerate() {
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}



	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}



	public double getSize() {
		return size;
	}



	public void setSize(double size) {
		this.size = size;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
