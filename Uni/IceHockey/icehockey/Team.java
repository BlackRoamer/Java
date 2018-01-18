package icehockey;

public class Team {

    private int ID;
    private String name = "";
    private int goalDif = 0;
    private int points = 0;

    public Team(int ID, String name) {
	this.ID = ID;
	this.name = name;
    }

    public int getID() {
	return ID;
    }

    public void setID(int iD) {
	this.ID = iD;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getGoals() {
	return goalDif;
    }

    public void setGoals(int goals) {
	this.goalDif += goals;
    }

    public int getPoints() {
	return points;
    }

    public void setPoints(int points) {
	this.points += points;
    }

}
