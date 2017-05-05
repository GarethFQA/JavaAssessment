package javaAssessmentBoat;

import java.util.Date;

public class Person {
	
	String firstName;
	String lastName;
	Date dateOfBirth;
	String nationality;
	String visaInfo;
	
	public Person(String fName, String lName, Date dob, String nationality)
	{
	this.firstName = fName;
	this.lastName = lName;
	this.dateOfBirth = dob;
	this.nationality = nationality;
	this.visaInfo = "";		
	}
	
	public Person(String fName, String lName, Date dob, String nationality, String visa)
	{
	this.firstName = fName;
	this.lastName = lName;
	this.dateOfBirth = dob;
	this.nationality = nationality;
	this.visaInfo = visa;		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	private void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getVisaInfo() {
		return visaInfo;
	}

	public void setVisaInfo(String visaInfo) {
		this.visaInfo = visaInfo;
	}
	
	/* 
	 * Misread stage one as saying non-uk must have visa, not MAY have vias as it should have been, incorrectly added these methods due to error
	 * public String changeNationality(String nationality)
	{
		if (nationality.equals("British"))
		{
			this.setNationality("British");
			return "Change successful";
		}
		else
		{	
			return "Visa Required For non-UK";
		}
		
	}
	
	public String changeNationality(String nationality, String visa)
	{
		if (nationality.equals("British"))
		{
			this.setNationality("British");
			return "Change successful - Visa not added as UK";
		}
		else
		{	
			this.setNationality(nationality);
			this.setVisaInfo(visa);
			return "Change successful";
		}
	}
	*/
	
		public String changeNationality(String nationality, String visa)
	{
		if (nationality.equals("British"))
		{
			this.setNationality("British");
			this.setVisaInfo("");
			return "Change successful - Visa not added as UK";
		}
		else
		{	
			this.setNationality(nationality);
			this.setVisaInfo(visa);
			return "Change successful";
		}
	}
		
		 public String changeNationality(String nationality)
			{
				if (nationality.equals("British"))
				{
					this.setNationality("British");
					this.setVisaInfo("");
					return "Change successful";
				}
				else
				{	
					this.setNationality(nationality);
					this.setVisaInfo("");
					return "Change successful - No visa present";
				}
				
			}
	

}