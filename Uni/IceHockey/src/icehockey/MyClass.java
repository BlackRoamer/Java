package icehockey;

public class MyClass {
    public static void main(String[] args) {
	
	Simulation sim = new Simulation();
	sim.runSimulation();
	for (int i = 0; i < Teamslist.getAllTeams().size(); i++) {
	    System.out.println(Teamslist.getAllTeams().get(i).getID() + " " + 
	Teamslist.getAllTeams().get(i).getName());
	}
    }
}
