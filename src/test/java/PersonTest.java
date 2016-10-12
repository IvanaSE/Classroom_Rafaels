import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p = new Person ("Rafael", "Silva", 30, 'M');
	@Test
	public void testFirstName() {
		p.setFirstName("Julian");
		assertEquals(p.getFirstName(), "Julian");
	}
	
	@Test
	public void testAge(){
		p.setAge(30);
		assertEquals(p.getAge(), 30);
	}
	
	@Test
	public void testLastName() {
		p.setLastName("Andersson");
		assertEquals(p.getLastName(), "Andersson");
	}
	
	@Test
	public void testGender() {
		p.setGender('M');
		assertEquals(p.getGender(), 'M');
	}

}
