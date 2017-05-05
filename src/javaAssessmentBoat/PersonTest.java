package javaAssessmentBoat;



import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;



public class PersonTest {
	

@Test public void testChangeNationality1() {

    Person testing = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");

    assertEquals("Change successful", testing.changeNationality("British"));

  }

@Test public void testChangeNationality2() {

    Person testing = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");

    assertEquals("Change successful - No visa present", testing.changeNationality("Irish"));

  }

@Test public void testChangeNationality3() {

    Person testing = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");

    assertEquals("Change successful", testing.changeNationality("Irish", "vis3974"));

  }

@Test public void testChangeNationality4() {

    Person testing = new Person("Gareth", "Forman", Date.valueOf("1983-01-27"), "British");

    assertEquals("Change successful - Visa not added as UK", testing.changeNationality("British", "vis3974"));

  }




}
