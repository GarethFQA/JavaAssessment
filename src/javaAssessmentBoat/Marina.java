package javaAssessmentBoat;

import java.util.ArrayList;
import java.util.Iterator;

public class Marina {
	
	String name;
	String address;
	double capacity;
	ArrayList<Boat> registeredBoats = new ArrayList<Boat>();
	
	public Marina(String name, String address, double capacity)
	{
		this.name = name;
		this.address = address;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCapactiy() {
		return capacity;
	}
	public void setCapactiy(double capacity) {
		this.capacity = capacity;
	}

	public ArrayList<Boat> getRegisteredBoats() 
	{
		return this.registeredBoats;
	}

	public void setRegisteredBoats(ArrayList<Boat> boats) 
	{
		this.registeredBoats = boats;
		return;
	}
	
	public String removeBoat(Boat boat) 
	{
		this.registeredBoats.remove(boat);
		return "Boat removed";
	}

	public String addBoat(Boat boat)
	{
		double totalOfBoatsSize = 0;
		Iterator<Boat> iterator = registeredBoats.iterator();
		while(iterator.hasNext())
		{
			Boat currentBoat = iterator.next();
			totalOfBoatsSize += currentBoat.getSize(); 
		}
		
		if(capacity - totalOfBoatsSize >= boat.getSize())
		{
			if(boat.boatHasAssingedPerson())
			{
				this.registeredBoats.add(boat);
				return "Boat added";
			}
			else
			{
				return "No person assigned to boat, cannot register boat to Marina";
			}
		}
		else
		{
			return "Not enough space in Marina, cannot register boat to Marina";
		}
	}
}




