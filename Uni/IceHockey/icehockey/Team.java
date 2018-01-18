package icehockey;

public class Team {

    private int ID = 0;
    private String name = "";
    private int goals = 0;
    private int points = 0;

    public Team(int ID, String name) {
	if (ID <= 0) {
	    try {
		throw new Exception();
	    } catch (Exception e) {
		System.out.println("ERROR INVALID ID ");
	    }
	    return;
	}
	this.ID = ID;
	this.name = name;
    }

    public int getID() {
	return ID;
    }

    public void setID(int iD) {
	if (iD <= 0) {
	    try {
		throw new Exception();
	    } catch (Exception e) {
		System.out.println("ERROR INVALID ID ");
	    }
	    return;
	}
	this.ID = iD;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getGoals() {
	return goals;
    }

    public void setGoals(int goals) {
	this.goals = goals;
    }

    public int getPoints() {
	return points;
    }

    public void setPoints(int points) {
	this.points = points;
    }

}
