package portal;

import java.util.ArrayList;
import java.util.List;

public class Lecture extends Course {
    private int lectureID = 0;
    private static int count = 1;
    private int credits;

    private List<Double> notes = new ArrayList<>();
    private double lectureAvrNote;
    private Professor professor;
    private int moduleId = 0;
    private static List<Lecture> lecturesList = new ArrayList<>();

    public Lecture(String name, int moduleId, Professor professor, int credits) {
	super(name);
	setCredits(credits);
	setProfessor(professor);
	setModuleId(moduleId);
	this.lectureID = count;
	count++;
	calculateAverage();
	lecturesList.add(this);
    }

    public int getCredits() {
	return credits;
    }

    public void setCredits(int credits) {
	if (credits > 9 || credits < 0) {
	    try {
		throw new Exception("Lecture must have maximal 9 credits");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    this.credits = credits;
	}
    }

    public int getLectureID() {
	return lectureID;
    }

    public Professor getProfessor() {
	return professor;
    }

    public void setProfessor(Professor professor) {
	this.professor = professor;
    }

    public int getModuleId() {
	return moduleId;
    }

    public void setModuleId(int moduleId) {
	this.moduleId = moduleId;
    }

    public static List<Lecture> getLecturesList() {
	return lecturesList;
    }

    public List<Double> getNotes() {
	return notes;
    }

    public void setNotes(double note) {
	this.notes.add(note);
    }

    public double getLectureAvrNote() {
	return lectureAvrNote;
    }

    public void setLectureAvrNote(double lectureAvrNote) {
	this.lectureAvrNote = lectureAvrNote;
    }

    private void calculateAverage() {
	double sum = 0;
	double avr = 0;
	for (int i = 0; i < this.notes.size(); i++) {
	    sum += this.notes.get(i);
	    avr = sum / this.notes.size();
	}
	this.lectureAvrNote = avr;
    }

    @Override
    public String toString() {
	// calculateAverage();
	String resultAverageNote = String.format("%.2f", this.lectureAvrNote);
	return this.lectureID + " " + this.getName() + " " + this.credits + " " + resultAverageNote;
    }

}
