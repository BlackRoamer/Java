package kit;

public class MyClass {

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Robin","Scmidt", 5 );
				
		Lecture lecture = new Lecture();
		Lecture lecture1 = new Lecture("HM");
		
		Lecturer  professor = new Lecturer ();
		Lecturer  professor1 = new Lecturer ("Mark", "Weber", lecture1);
		Lecturer  professor2 = new Lecturer ("Kevin", "Gross");
		
		Tutorial tut = new Tutorial();
		Tutorial tut1 = new Tutorial(lecture1, 5);
		
		lecture.setLectureName("GBI");
				
		tut.setTutorialNumber(8);
		tut.setTutorialName(lecture);
		
		/*
		 * When we want to set tutorial and lecture to student, we should use
		 * Array and for loop Example : 
		 * Lecture[] lectures = new Lecture[3];
		 * lectures[0] = new Lecture("Physik");
		 *  lectures[1] = new Lecture("HM");
		 * lectures[2] = new Lecture("DigitalTechnik");
		 * student.setStudentLecture(lectures); and printing the name of the
		 * lectures and tutorials with for loop
		 */
		
		
		student.setFistName("Henry");
		student.setLastName("Alonso");
		student.setNumberOfSemester(2);
		
		professor.setProfessorFirstName("Jacob");
		professor.setProfessorLastName("Schmidt");
		
		System.out.println(student);
		System.out.println(student1);	
		
		System.out.println(lecture);
		System.out.println(lecture1);
		
		System.out.println(tut);
		System.out.println(tut1);
		
		System.out.println(professor);
		System.out.println(professor1);
		System.out.println(professor2);
		
	}

}
