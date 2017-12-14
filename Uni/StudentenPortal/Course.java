package portal;

public class Course {

    private String name;
    private int credits = 0;

    public Course(String name) {
	setName(name);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name.toLowerCase();
    }

    public int getCredits() {
	return credits;
    }

    public void setCredits(int credits) {
	if (credits < 0) {
	    try {
		throw new Error("Credits must be positive number");
	    } catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	    }
	} else {
	    this.credits = credits;
	}
    }
}
