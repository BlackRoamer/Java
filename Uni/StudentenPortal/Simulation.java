package portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    public void runTheProgramm() {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	while (!input.equals("quit")) {
	    String[] splittedInput = input.split(" ");
	    String command = splittedInput[0];
	    String[] splittedCommand = command.split("-");
	    String commandInput = "";
	    if (splittedCommand[0].equals("add") || command.equals("examination-marking")) {
		try {
		    commandInput = splittedInput[1];
		} catch (Exception e) {
		    System.out.println("Error: Invalid paramaters");
		}
	    }
	    switch (command) {
	    case "add-professor":
		addProfessor(commandInput);
		break;
	    case "list-professor":
		listProfesor();
		break;
	    case "add-student":
		addStudent(commandInput);
		break;
	    case "list-student":
		listStudents();
		break;
	    case "add-module":
		addModule(commandInput);
		break;
	    case "list-module":
		listModules();
		break;
	    case "add-lecture":
		addLecture(commandInput);
		break;
	    case "list-lecture":
		listLectures();
		break;
	    case "examination-marking":
		setNote(commandInput);
		break;
	    case "reset":
		resetTheProgramm();
		break;
	    default:
		System.out.println("Invalid command");
	    }

	    input = scan.nextLine();

	}
    }

    private void resetTheProgramm() {
	Module.getModulesList().clear();
	Professor.getAllProffesors().clear();
	Student.getAllStudents().clear();
	Lecture.getLecturesList().clear();
	System.out.println("Ok");
    }

    private void setNote(String input) {
	String[] params = input.split(";");
	if (params.length != 3) {
	    try {
		throw new Exception("Examination marks must take 3 param");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    int lectureId = Integer.parseInt(params[0]); // TODO
	    String studentId = params[1];
	    double note = Double.parseDouble(params[2]); // TODO
	    boolean existingLecture = checkForExistingLecture(Lecture.getLecturesList(), lectureId);
	    boolean existingStudent = checkForExistingStudent(Student.getAllStudents(), studentId);
	    if (existingLecture && existingStudent) {
		setNoteToStudent(Student.getAllStudents(), Lecture.getLecturesList(), lectureId, studentId, note);
		System.out.println("Ok");
	    } else {
		System.out.println("Error: Invalid Student or lecture");
	    }

	}
    }

    private void setNoteToStudent(List<Student> stList, List<Lecture> lectureList, int lectureId, String studentId,
	    double note) {

	for (int k = 0; k < stList.size(); k++) {
	    if (stList.get(k).getID().equals(studentId)) {
		stList.get(k).setNotes(note);
		break;
	    }
	}
	for (int k = 0; k < lectureList.size(); k++) {
	    if (lectureList.get(k).getLectureID() == lectureId) {
		lectureList.get(k).setNotes(note);
		return;
	    }
	}
    }

    private boolean checkForExistingLecture(List<Lecture> list, int lectureId) {
	for (int i = 0; i < list.size(); i++) {
	    if (list.get(i).getLectureID() == lectureId) {
		return true;
	    }
	}
	return false;
    }

    private boolean checkForExistingStudent(List<Student> list, String studentId) {
	for (int i = 0; i < list.size(); i++) {
	    if (list.get(i).getID().equals(studentId)) {
		return true;
	    }
	}
	return false;
    }

    private void addModule(String input) {
	String[] modulesParams = input.split(";");

	if (modulesParams.length != 1 || modulesParams[0].length() == 0) {
	    System.out.println(modulesParams.length);
	    try {
		throw new Exception("Modules must take 1 param and it can't be empty");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }

	} else {
	    String name = modulesParams[0];
	    Module module = new Module(name);
	    System.out.println("Ok");
	}

    }

    private void listModules() {
	List<Module> allModules = new ArrayList<>();
	allModules = Module.getModulesList();
	String allmodulesToStr = allModules.toString();
	String finalStr = allmodulesToStr.substring(1, allmodulesToStr.length() - 1);
	finalStr = finalStr.replaceAll(", ", "\n");
	System.out.println(finalStr);

    }

    private void listLectures() {
	List<Lecture> allLectures = new ArrayList<>();
	allLectures = Lecture.getLecturesList();
	String allLecturesToStr = allLectures.toString();
	String finalStr = allLecturesToStr.substring(1, allLecturesToStr.length() - 1);
	finalStr = finalStr.replaceAll(", ", "\n");
	System.out.println(finalStr);

    }

    private void addLecture(String input) {
	String[] lecturesParams = input.split(";");
	if (lecturesParams.length != 6) {
	    try {
		throw new Exception("Lecture must take 6 params");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    String name = lecturesParams[0];
	    int moduleId = 0;
	    try {
		moduleId = Integer.parseInt(lecturesParams[1]);
	    } catch (Exception e) {
		System.out.println("Error: Module ID can't be parsed to Integer");
		return;
	    }
	    // TODO CHECK
	    String fnameProf = lecturesParams[2];
	    String lnameProf = lecturesParams[3];
	    String chairNameProf = lecturesParams[4];
	    int credits = 0;
	    try {
		credits = Integer.parseInt(lecturesParams[5]);
	    } catch (Exception e) {
		System.out.println("Error: Credits can't be parsed to Integer");
		return;// TODO CHECK IF
	    }
	    // CAN BE PARSED
	    Professor prof = new Professor(fnameProf, lnameProf, chairNameProf);
	    Lecture lec = new Lecture(name, moduleId, prof, credits);
	    prof.setLectures(lec);
	    for (int k = 0; k < Module.getModulesList().size(); k++) {
		if (Module.getModulesList().get(k).getModuleID() == moduleId) {
		    Module.getModulesList().get(k).setLecturesInTheModule(lec);
		    Module.getModulesList().get(k).setModuleCredits();

		}
	    }
	    System.out.println("Ok");
	}

    }

    private void listStudents() {
	List<Student> allStudents = new ArrayList<>();
	allStudents = Student.getAllStudents();
	String allStudentsToStr = allStudents.toString();
	String finalStr = allStudentsToStr.substring(1, allStudentsToStr.length() - 1);
	finalStr = finalStr.replaceAll(", ", "\n");
	System.out.println(finalStr);

    }

    private void addStudent(String input) {
	String[] studentParams = input.split(";");
	if (studentParams.length != 3) {
	    try {
		throw new Exception("Student must take 3 params");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    String fname = studentParams[0];
	    String lname = studentParams[1];
	    String ID = studentParams[2];
	    if (Student.checkForDuplicatedIdStudents(ID)) {
		return;
	    }
	    Student st = new Student(fname, lname, ID);
	    System.out.println("Ok");
	}

    }

    private void listProfesor() {
	List<Professor> allProfs = new ArrayList<>();
	allProfs = Professor.getAllProffesors();
	String allProfsToStr = allProfs.toString();
	String finalStr = allProfsToStr.substring(1, allProfsToStr.length() - 1);
	finalStr = finalStr.replaceAll(", ", "\n");
	System.out.println(finalStr);
    }

    private void addProfessor(String input) {
	String[] proffesorParams = input.split(";");
	if (proffesorParams.length != 3) {
	    try {
		throw new Exception("Professor must take 3 params");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    String fname = proffesorParams[0];
	    String lname = proffesorParams[1];
	    String chair = proffesorParams[2];
	    if (Professor.checkForDuplicatedProfessors(fname, lname)) {
		return;
	    }
	    Professor prof = new Professor(fname, lname, chair);
	    System.out.println("Ok");
	}
    }
}
