package otherclasses;


import java.util.ArrayList;

public class Classroom {
	
	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student> students = new ArrayList<Student>();
	
		
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students){
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;		
	}	
	
	
	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addANewStudent(Student student){
		this.students.add(student);
	}
	

	public void removeAStudent(String name){
		Student student = null;
		boolean studentExists = false;
		for(int i= 0 ; i < this.students.size() ; i++){
			student = this.students.get(i);
			if (student.getFirstName().contains(name)){
				studentExists = true;
				this.students.remove(i);
				System.out.println("Student "+name+" successfully removed!");
			}	
		}
		
		if (!studentExists){
			System.out.println("The student does not exist!");
		}
		
		
	}
	
	public void printFullRelatory(){
		System.out.println("Classroom name: "+this.classroomName);
		System.out.println("Classroom term: "+this.classroomTerm+"\n");
		for (Student student : this.students){
			System.out.println(student.toString());
		}
	}
	
	
}
