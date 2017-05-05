package javaAssessmentBoat;

//import java.util.ArrayList;

public class Marina {
	
	String name;
	String address;
	double capacity;
	//Commented out as will not work until Boat is implemented
	//ArrayList<Boat> boats = new ArrayList<Boat>;
	
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
	/*
	 * Commented out as will not work until Boat is implemented
	 * 
	public ArrayList<Boat> getBoats() {
		return boats;
	}
	public void setBoats(ArrayList<Boat> boats) {
		this.boats = boats;
	}
	
		public String addBoat(Boat) {
		this.boats.add(Boat)
		return "Boat";
	}
	
		public String removeBoat(Boat) {
		this.boats.remove(Boat)
		return "Boat removed";
	}
	*/
	
}
