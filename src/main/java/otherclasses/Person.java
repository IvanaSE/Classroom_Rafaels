package otherclasses;

public class Person {
	//Attributes
	private int age = 100;
	private String firstName ="";
	private String lastName="";
	private char gender='X';
	
	//Constructor
	public Person( String firstName, String lastName,int age, char gender) {		
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	//getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	

}
