package portal;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {

    private Chair chair;
    private List<Lecture> lectures = new ArrayList<>();
    private double averageNote;
    private static List<Professor> allProffesors = new ArrayList<>();

    public Professor(String firstName, String lastName, String chairName) {
	super(firstName, lastName);
	Chair chair = new Chair(chairName);
	this.chair = chair;
	allProffesors.add(this);
    }

    public Chair getChair() {
	return chair;
    }

    public List<Lecture> getLectures() {
	return lectures;
    }

    public void setLectures(Lecture lecture) {
	this.lectures.add(lecture);
    }

    public static List<Professor> getAllProffesors() {
	return allProffesors;
    }

    public static boolean checkForDuplicatedProfessors(String fname, String lname) {
	for (int i = 0; i < allProffesors.size(); i++) {
	    if (allProffesors.get(i).getFirstName().equals(fname) && allProffesors.get(i).getLastName().equals(lname)) {
		try {
		    throw new Exception("2 Professors with same names");
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		    return true;
		}
	    }
	}
	return false;
    }

    private void calculateAverage() {
	double sum = 0;
	double avr = 0;
	for (int i = 0; i < this.lectures.size(); i++) {
	    sum += this.lectures.get(i).getLectureAvrNote();
	    avr = sum / this.lectures.size();

	}
	this.averageNote = avr;
    }

    @Override
    public String toString() {
	calculateAverage();
	String resultAverageNote = String.format("%.2f", this.averageNote);
	return this.chair.getName() + " " + this.getFirstName() + " " + this.getLastName() + " " + resultAverageNote;
    }

}
