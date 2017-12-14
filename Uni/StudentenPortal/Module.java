package portal;

import java.util.ArrayList;
import java.util.List;

public class Module extends Course {

    private int moduleID = 1;
    private static int count = 1;
    private int moduleCredits = 0;
    private double averageNote;
    private List<Lecture> lecturesInTheModule = new ArrayList<>();
    private static List<Module> modulesList = new ArrayList<>();

    public Module(String name) {
	super(name);
	this.moduleID = count++;
	modulesList.add(this);
    }

    public int getModuleID() {
	return moduleID;
    }

    public static List<Module> getModulesList() {
	return modulesList;
    }

    public int getModuleCredits() {
	return moduleCredits;
    }

    public void setModuleCredits() {
	int sumOfCredits = 0;
	for (int i = 0; i < lecturesInTheModule.size(); i++) {
	    sumOfCredits += lecturesInTheModule.get(i).getCredits();
	}
	if (sumOfCredits > 45 || sumOfCredits < 0) {
	    try {
		throw new Exception("Module must have maximal 45 credits");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    this.moduleCredits = sumOfCredits;
	}
    }

    public List<Lecture> getLecturesInTheModule() {
	return lecturesInTheModule;
    }

    public void setLecturesInTheModule(Lecture lecturesInTheModule) {
	this.lecturesInTheModule.add(lecturesInTheModule);
    }
    private void calculateAverage() {
	 double sum = 0;
	 double avr = 0;
	 int credits = 0;
	for(int i = 0; i < this.lecturesInTheModule.size(); i++) {
	    sum += this.lecturesInTheModule.get(i).getLectureAvrNote();
	    avr = sum / this.lecturesInTheModule.size();
	    credits += this.lecturesInTheModule.get(i).getCredits();
	}
	this.averageNote = avr;
	setCredits(credits);
   }

    @Override
    public String toString() {
	calculateAverage();
	String resultAverageNote = String.format("%.2f", this.averageNote);
	return this.moduleID + " " + this.getName() + " " + this.moduleCredits + " " + resultAverageNote;
    }

}
