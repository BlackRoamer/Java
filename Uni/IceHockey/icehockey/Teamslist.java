package icehockey;

import java.util.ArrayList;
import java.util.List;

public class Teamslist {

    private static List<Team> allTeams = new ArrayList<Team>();

    public static List<Team> getAllTeams() {
	return allTeams;
    }

    public static void setAllTeams(Team team) {
	    allTeams.add(team);
	
    }

}
