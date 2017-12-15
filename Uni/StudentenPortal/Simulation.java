package portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	    if (splittedCommand[0].equals("add") || command.equals("examination-marking")
		    || splittedCommand[0].equals("summary")) {
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
	    case "summary-professor":
		summaryProfessor(commandInput);
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

    private void summaryProfessor(String input) {
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
	    for (int k = 0; k < Professor.getAllProffesors().size(); k++) {
		if (Professor.getAllProffesors().get(k).getFirstName().equals(fname)) {
		    if (Professor.getAllProffesors().get(k).getLastName().equals(lname)) {
			if (Professor.getAllProffesors().get(k).getChair().getName().equals(chair)) {
			    Professor prof = Professor.getAllProffesors().get(k);
			    prof.printSummary();
			}
		    }
		}
	    }
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
	    int lectureId = -1;
	    try {
		lectureId = Integer.parseInt(params[0]);
	    } catch (Exception e) {
		System.out.println("Lecture ID can't be parsed");
	    }
	    String studentId = params[1];
	    double note = -1;
	    try {
		note = Double.parseDouble(params[2]);
	    } catch (Exception e) {
		System.out.println("Note can not be parsed");
	    }
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
	Collections.sort(allModules, new Comparator<Module>() {
	    public int compare(Module m1, Module m2) {
		int firstModuleId = m1.getModuleID();
		int secondModuleId = m2.getModuleID();
		if (firstModuleId > secondModuleId) {
		    return -1;
		} else if (firstModuleId < secondModuleId) {
		    return 1;
		} else {
		    return 0;
		}
	    }
	});
	String allmodulesToStr = allModules.toString();
	String finalStr = allmodulesToStr.substring(1, allmodulesToStr.length() - 1);
	finalStr = finalStr.replaceAll(", ", "\n");
	System.out.println(finalStr);

    }

    private void listLectures() {
	List<Lecture> allLectures = new ArrayList<>();
	allLectures = Lecture.getLecturesList();
	Collections.sort(allLectures, new Comparator<Lecture>() {
	    public int compare(Lecture l1, Lecture l2) {
		int firstLectureId = l1.getLectureID();
		int secondLectureId = l2.getLectureID();
		if (firstLectureId > secondLectureId) {
		    return -1;
		} else if (firstLectureId < secondLectureId) {
		    return 1;
		} else {
		    return 0;
		}
	    }
	});
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

	    String fnameProf = lecturesParams[2];
	    String lnameProf = lecturesParams[3];
	    String chairNameProf = lecturesParams[4];
	    int credits = 0;
	    try {
		credits = Integer.parseInt(lecturesParams[5]);
	    } catch (Exception e) {
		System.out.println("Error: Credits can't be parsed to Integer");
		return;
	    }

	    Professor prof = new Professor(fnameProf, lnameProf, chairNameProf);
	    Lecture lec = new Lecture(name, moduleId, prof, credits);
	    prof.setLectures(lec);
	    prof.setLecturesAndNotes(lec.getName(), lec.getLectureAvrNote());
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
	Collections.sort(allStudents, new Comparator<Student>() {
	    public int compare(Student st1, Student st2) {
		String firstStudentId = st1.getID();
		String secondStudentId = st2.getID();
		return firstStudentId.compareTo(secondStudentId);
	    }
	});
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
	Collections.sort(allProfs, new Comparator<Professor>() {

	    @Override
	    public int compare(Professor p1, Professor p2) {
		int result = p1.getFirstName().compareTo(p2.getFirstName());
		if (result != 0) {
		    return result;
		}
		return p1.getLastName().compareTo(p2.getLastName());
	    }

	});
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
