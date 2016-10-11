package main;

import java.util.ArrayList;

import otherclasses.Classroom;
import otherclasses.Student;

public class Main {	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Classroom classroom = new Classroom("TEST15", "Spring 16", students);
		Student student1 = new Student("Rafael", "Silva", 20, 'M', 3.1, 5.4, 6.2);
		Student student2 = new Student("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8, 6.1);
		Student student3 = new Student("Hans", "Ekström", 20, 'M', 8.8, 5.0, 6.0);
		Student student4 = new Student("Patrik", "Hollsten", 20, 'F', 8.2, 7.3, 6.0);
		Student student5 = new Student("Gopi", "Sundarraj", 20, 'M', 8.2, 9.0, 6.0);

		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		classroom.addANewStudent(student3);
		classroom.addANewStudent(student4);
		classroom.addANewStudent(student5);
		System.out.println("################ STUDENT LIST ###############");
		classroom.printFullRelatory();
		
	}

}
