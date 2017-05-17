package kit;

public class Student {
private String firstName = null;
private String lastName = null;
private static int counter = 0; // this is static int,
//which changes its value , when object is created
private int numberOfSemester = 0;
private int ID = 0;
public static int  index = 0;
private Lecture[] lecture = new Lecture[100000];
private Tutorial[] tutorial;
public  Student(String firstNameConstructor, String lastNameConstructor, 
		int numberOfSemesterConstructor) { // special constructor
	
	firstName = firstNameConstructor;
	lastName = lastNameConstructor;
	numberOfSemester = numberOfSemesterConstructor;
	ID = counter; // Here we save ID , when object is created
	counter++;
	
}
public Student() { //We should  write default constructor, because when we make constructor 
//	with parameters compiler does not provided default no-arg constructor.
	ID = counter; // Here we save ID , when object is created
	counter++;
}
public String toString() {
	return firstName + " " + lastName + " " + ID + " " + numberOfSemester;
}

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public int getId() {
	return ID;
}
public int getNumberOfSemester() {
	return numberOfSemester;
}
public Lecture[] getStudentLecture() {
	return lecture;
}
public Tutorial[] getStudentTutorial() {
	return tutorial;
}
public void setFistName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setNumberOfSemester(int numberOfSemester) {
	this.numberOfSemester = numberOfSemester;
}
public void setStudentLecture(Lecture[] lecture) { // Array , because
	// Student can attend more than one lecture
	this.lecture = lecture;
	}
public void setStudentTutorial(Tutorial[] tutorial) { // Array , because
	// Student can attend more than one tutorial
	this.tutorial = tutorial;
}
}
