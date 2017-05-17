package kit;

public class Tutorial {
private Lecture lecture;
private int tutorialNumber = 0;
private String tutorialName = null;
//Constructor with the Tutorial Name and tutorial number
public Tutorial(Lecture lecture, int tutorialNumberConstrucotr) {
	tutorialNumber = tutorialNumberConstrucotr;
	tutorialName = lecture.getLectureName();
}
// Default constructor
public Tutorial() {
	
}
public String toString() {
	return tutorialName  + " " + tutorialNumber;
}
public String getTutorialName() {
	return tutorialName;
}
public int getTutorialNumber() {
	return tutorialNumber;
}
public void setTutorialNumber(int tutorialNumber) {
	this.tutorialNumber = tutorialNumber;
}
public void setTutorialName(Lecture lecture) { // Here we show , that the tutorial
	// should take the name from lecture
	this.tutorialName = lecture.getLectureName();
}
}
