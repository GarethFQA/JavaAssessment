package javaAssessmentBoat;

public class Boat implements Vehicle {
	
	String name;
	String countryOfOrigin;
	double size;
	int speed;
	
	public Boat(String name, String country, double size)
	{
		this.name = name;
		this.countryOfOrigin = country;
		this.size = size;
		this.speed = 0;
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
