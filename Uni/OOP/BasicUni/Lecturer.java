package kit;

public class Lecturer  {
private String professorFistName = null;
private String professorLastName = null;
private int professorId = 0;
private static int professorcount = 0; // this is static int,
//which changes its value , when object is created
private Lecture lecture;
// Constructor for professor
public Lecturer (String professorFirstNameConstructor, 
		String professorLastNameConstructor, Lecture lecture) {
	professorFistName = professorFirstNameConstructor;
	professorLastName = professorLastNameConstructor;
	professorId = professorcount; // Here we store the professor ID
	professorcount++; // professor ID counter
	}
// Constructor for professor , when professor doesn't lead lecture
public Lecturer (String professorFirstNameConstructor, 
		String professorLastNameConstructor) {
	professorFistName = professorFirstNameConstructor;
	professorLastName = professorLastNameConstructor;
	professorId = professorcount; // Here we store the professor ID
	professorcount++; // professor ID counter
	}

//Default constructor
public Lecturer () {
	professorId = professorcount; // Here we store the professor ID
	professorcount++; // professor ID counter
}
public String toString() {
	return professorFistName + " " + professorLastName + " " + professorId;
}
public String getProfessorFirstName() {
	return professorFistName;
}
public String getProfessorLastName() {
	return professorLastName;
}
public int getProfessorId() {
	return professorId;
}
public Lecture getProfessorLecture() {
	return lecture;
}
public void setProfessorFirstName(String professorFirstName) {
	this.professorFistName = professorFirstName;
}
public void setProfessorLastName(String professorLastName) {
	this.professorLastName = professorLastName;
}
public void setProfessorLecture(Lecture lecture) {
	this.lecture = lecture;
}
} 
