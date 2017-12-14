package portal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student extends Person {

    private String ID;
    private Set<String> uniqueIds = new HashSet<>();
    private static List<Student> allStudents = new ArrayList<>();
    private List<Double> notes = new ArrayList<>();
    private Map<String, Integer> lectureNotes = new HashMap<>();
    private double averageNote = 0;

    public Student(String firstName, String lastName, String ID) {
	super(firstName, lastName);
	setID(ID);
	allStudents.add(this);
    }

    public static List<Student> getAllStudents() {
	return allStudents;
    }

    public String getID() {
	return ID;
    }

    private void setID(String ID) {
	if (ID.length() != 6) {
	    try {
		throw new Exception("ID must be 6 digits");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else if (uniqueIds.contains(ID)) {
	    try {
		throw new Exception("This ID already exists");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    this.ID = ID;
	}
    }

    public List<Double> getNotes() {
	return notes;
    }

    public void setNotes(double note) {
	if (note < 1 || note > 5) {
	    try {
		throw new Exception("Note must be between 1 - 5");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    this.notes.add(note);
	}
    }

    public Map<String, Integer> getLectureNotes() {
	return lectureNotes;
    }

    public static boolean checkForDuplicatedIdStudents(String Id) {
	for (int i = 0; i < allStudents.size(); i++) {
	    if (allStudents.get(i).getID().equals(Id)) {
		try {
		    throw new Exception("2 Students with same ID");
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		    return true;
		}
	    }
	}
	return false;
    }

    public double getAverageNote() {
	return averageNote;
    }

    private void calculateAverage() {
	double sum = 0;
	double avr = 0;
	for (int i = 0; i < this.notes.size(); i++) {
	    sum += this.notes.get(i);
	    avr = sum / this.notes.size();
	}
	this.averageNote = avr;
    }

    @Override
    public String toString() {
	calculateAverage();
	String resultAverageNote = String.format("%.2f", this.averageNote);
	return this.ID + " " + this.getFirstName() + " " + this.getLastName() + " " + resultAverageNote;
    }

}
