package kit;

public class Lecture {
private String lectureName = null;
private int lectureId = 0;
private static int lectureCounter = 0;// this is static int,
//which changes its value , when object is created
// This is the special constructor , where we fix lecture name and show , that 1Proffesor
// can have only 1 lecture
public Lecture(String lectureNameConstructor) { 
	lectureName = lectureNameConstructor;
	lectureId = lectureCounter; // With lectureCounter we save the ID for every lecture
	lectureCounter++;
} 
public Lecture() {
	lectureId = lectureCounter; // With lectureCounter we save the ID for every lecture
	lectureCounter++; // increase by 1 , when lecture are made
}
public String toString() {
	return lectureName + " " + lectureId;
}
public String getLectureName() {
	return lectureName;
}
public int getLectureId() {
	return lectureId;
}
public void setLectureName(String lectureName) {
	this.lectureName = lectureName;
}
}
