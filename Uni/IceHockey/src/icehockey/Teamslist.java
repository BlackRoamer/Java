package icehockey;

import java.util.ArrayList;
import java.util.List;

public class Teamslist {

    private static List<Team> allTeams = new ArrayList<Team>();

    public static List<Team> getAllTeams() {
	return allTeams;
    }

    public static void setAllTeams(Team team) {
	if (checkForExistingTeams(team)) {
	    allTeams.add(team);
	    System.out.println("Ok");
	}
    }

    private static boolean checkForExistingTeams(Team team) {
	
	for (int i = 0; i < allTeams.size(); i++) {
	    int tempId = allTeams.get(i).getID();
	    String tempName = allTeams.get(i).getName();
	    if (team.getID() == tempId || team.getName().equals(tempName)) {
		System.out.println("ERROR: Existing Team");
		return false;
	    }
	}
	return true;
    }
    
   

}
