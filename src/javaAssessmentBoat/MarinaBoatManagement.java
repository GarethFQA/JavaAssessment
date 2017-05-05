package javaAssessmentBoat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MarinaBoatManagement {

	ArrayList<Boat> boats = new ArrayList<Boat>();
	ArrayList<Person> people = new ArrayList<Person>();
	ArrayList<Marina> marinas = new ArrayList<Marina>();
	
	
	public MarinaBoatManagement()
	{
		
	}
	
	public String populateObjectsFromFile(String filename)
	{
		
		
		String fullFile = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) 
		{
			
			String line = br.readLine();
    		fullFile += line;
    		line = br.readLine();
		    while (line != null) 
		    {
		    	if (line.equals("Marinas"))
		    	{
		    		
		    		
		    	}
	    		if (!line.equals("|")) 
			    {		 
	    			fullFile += "~" + line;
		    		line = br.readLine();
		    		System.out.println(fullFile);
			    }
	    		else if (line.equals("")) 
			    {	
		    		line = br.readLine();
		    		System.out.println(fullFile);
			    }
	    		{
		    		fullFile += line;
		    		line = br.readLine();
		    		fullFile += line;
		    		line = br.readLine();
		    		System.out.println(fullFile);
	    		}


		    }
		    

		    
		}catch (IOException e) 
		{
			System.out.println("Unable to find file. \nObject with no people or animals created.\n");

		}
		
		return "Finished";
	}
	
	public String assignBoatToMarina(Boat boat, Marina marina)
	{
		if(!isBoatAlreadyAssigned(boat))
		{
			return marina.addBoat(boat);
		}
		return "Boat is already assigned to a Marina. Boat not assisgned";
	}
	
	public boolean isBoatAlreadyAssigned(Boat boat)
	{
		Iterator<Marina> iterator = marinas.iterator();
		while(iterator.hasNext())
		{
			Marina currentMarina = iterator.next();
			Iterator<Boat> iterator2 = currentMarina.getRegisteredBoats().iterator();
			while(iterator2.hasNext())
			{
				Boat currentBoat = iterator2.next();
				if (currentBoat == boat)
				{
					return true;
				}
			}			
		}		
		return false;
	}
	
	public String addBoat(Boat boat)
	{
		Iterator<Boat> iterator = boats.iterator();
		while(iterator.hasNext())
		{
			Boat currentBoat = iterator.next();
			if(currentBoat == boat)
			{
				return "Boat already exists, not added";
			}
			
		}
		
		boats.add(boat);
		return "Boat added";
	}
	
	public String addPerson(Person person)
	{
		Iterator<Person> iterator = people.iterator();
		while(iterator.hasNext())
		{
			Person currentPerson = iterator.next();
			if(currentPerson == person)
			{
				return "Person already exists, not added";
			}
			
		}
		
		people.add(person);
		return "Person added";
	}
	
	public String addMarina(Marina marina)
	{
		Iterator<Marina> iterator = marinas.iterator();
		while(iterator.hasNext())
		{
			Marina currentMarina = iterator.next();
			if(currentMarina == marina)
			{
				return "Marina already exists, not added";
			}
			
		}
		
		marinas.add(marina);
		return "Marina added";
	}
	
	
	public ArrayList<Boat> getBoats() {
		return boats;
	}
	public void setBoats(ArrayList<Boat> boats) {
		this.boats = boats;
	}
	public ArrayList<Person> getPeople() {
		return people;
	}
	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	public ArrayList<Marina> getMarinas() {
		return marinas;
	}
	public void setMarinas(ArrayList<Marina> marinas) {
		this.marinas = marinas;
	}
	
	
}
