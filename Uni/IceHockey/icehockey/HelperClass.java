package icehockey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelperClass {
    
    protected static List<Team> sortTeamsById() {
   	List<Team> copyOfTeams = new ArrayList<>(Teamslist.getAllTeams());
   	Collections.sort(copyOfTeams, new Comparator<Team>() {
   	    @Override
   	    public int compare(Team o1, Team o2) {

   		return o1.getID() - o2.getID();
   	    }
   	});
   	return copyOfTeams;

       }
    
    protected static List<Team> sortTeamsByPoints() {
	List<Team> copyOfTeams = new ArrayList<>(Teamslist.getAllTeams());
	Collections.sort(copyOfTeams, new Comparator<Team>() {
	    @Override
	    public int compare(Team o1, Team o2) {

		return o2.getPoints() - o1.getPoints();
	    }
	});
	return copyOfTeams;

    }

    protected static void calculatePoints(Team firstTeam, int firstTeamScore, Team secondTeam, int secondTeamScore,
	    int gameTime) {
	int draw = 1;
	int winInTime = 3;
	int loseInTime = 0;
	int winOverTime = 2;
	int loseOverTime = 1;
	int firstTeamGoalDif = firstTeamScore - secondTeamScore;
	int secondTeamGoalDif = secondTeamScore - firstTeamScore;
	firstTeam.setGoals(firstTeamGoalDif);
	secondTeam.setGoals(secondTeamGoalDif);
	if (firstTeamScore == secondTeamScore) {
	    firstTeam.setPoints(draw);
	    secondTeam.setPoints(draw);
	} else if (firstTeamScore > secondTeamScore) {
	    if (gameTime > 60) {
		firstTeam.setPoints(winOverTime);
		secondTeam.setPoints(loseOverTime);
	    } else {
		firstTeam.setPoints(winInTime);
		secondTeam.setPoints(loseInTime);
	    }
	} else {
	    if (gameTime > 60) {
		secondTeam.setPoints(winOverTime);
		firstTeam.setPoints(loseOverTime);
	    } else {
		secondTeam.setPoints(winInTime);
		firstTeam.setPoints(loseInTime);
	    }
	}
    }

    protected static boolean checkForValidGame(int firstTeamScore, int secondTeamScore, int gameTime) {
	if (firstTeamScore == secondTeamScore && gameTime == 60) {
	    System.out.println("Error: The game is not valid");
	    return false;
	}
	return true;
    }

    protected static Team findTeamById(int teamId) {

	for (Team team : Teamslist.getAllTeams()) {
	    if (team.getID() == teamId) {
		return team;
	    }
	}

	return null;
    }

    protected static boolean checkForPositiveScore(int score) {
	if (score < 0) {
	    System.out.println("Error: Score must be a positive number");
	    return false;
	}
	return true;
    }

    protected static boolean checkForGameTime(int gameTime) {

	if (gameTime < 60 && gameTime > 120) {
	    System.out.println("Error: Time must be between 60 and 120");
	    return false;
	}
	return true;

    }

    protected static boolean checkForRegisteredTeam(int teamId) {
	for (int i = 0; i < Teamslist.getAllTeams().size(); i++) {
	    int tempId = Teamslist.getAllTeams().get(i).getID();
	    if (tempId == teamId) {
		return true;
	    }
	}
	System.out.println("Error: Team is not registered");
	return false;
    }

    protected static int parseTime(String gameTime) {
	int time = -1;
	try {
	    time = Integer.parseInt(gameTime);
	} catch (Exception e) {
	    System.out.println("Gametime can't be parsed");
	}
	return time;
    }

    protected static int parseScore(String teamScore) {
	int score = -1;
	try {
	    score = Integer.parseInt(teamScore);
	} catch (Exception e) {
	    System.out.println("Score can't be parsed");

	}
	return score;
    }

    protected static int parseId(String ID) {
	int Id = -1;
	try {
	    Id = Integer.parseInt(ID);
	} catch (Exception e) {
	    System.out.println("ID can't be parsed");

	}
	return Id;
    }

    protected static boolean checkForExistingTeams(Team team) {

	for (int i = 0; i < Teamslist.getAllTeams().size(); i++) {
	    int tempId = Teamslist.getAllTeams().get(i).getID();
	    String tempName = Teamslist.getAllTeams().get(i).getName();
	    if (team.getID() == tempId || team.getName().equals(tempName)) {
		System.out.println("ERROR: Existing Team");
		return false;
	    }
	}
	return true;
    }

    protected static boolean checkConstructorParams(int ID, String name) {
	if (ID <= 0) {
	    System.out.println("Error: Invalid ID");
	    return false;
	}
	if (name.isEmpty() || name == null) {
	    System.out.println("Error: Invalid Teamname");
	    return false;
	}
	return true;
    }

    protected static boolean checkForParamsAddTeamCommand(String[] input) {

	if (input.length != 2) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	} else {
	    String[] splittedInput = input[1].split(";");
	    if (splittedInput.length != 2) {
		System.out.println("Error: Invalid number of params in command");
		return false;
	    }
	}

	return true;
    }

    protected static boolean checkForParamsListTeamsCommand(String[] input) {
	if (input.length != 1) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	}
	return true;
    }

    protected static boolean checkForParamsAddMatch(String[] input) {
	if (input.length != 2) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	} else {
	    String[] splitInput = input[1].split(";");
	    if (splitInput.length != 5) {
		System.out.println("Error: Invalid number of params in the command ");
		return false;
	    }
	}
	return true;
    }

    protected static boolean checkForParamsPrint(String[] input) {
	if (input.length != 1) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	}
	return true;
    }

    protected boolean checkForParams(String[] input) {
	String command = input[0];
	switch (command) {
	case "add-team":
	    if (input.length != 2) {
		System.out.println("Error: Invalid number of params");
		return false;
	    }
	case "list-team":
	    if (input.length != 1) {
		System.out.println("Error: Invalid number of params");
		return false;
	    }
	case "add-ice-hockey-match":
	    if (input.length != 2) {
		System.out.println("Error: Invalid number of params");
		return false;
	    } else {
		String[] splitInput = input[1].split(";");
		if (splitInput.length != 5) {
		    System.out.println("Error: Invalid number of params in the command ");
		    return false;
		}
	    }
	case "print-del-standings":
	    if (input.length != 1) {
		System.out.println("Error: Invalid number of params");
		return false;
	    }
	case "quit":
	    if (input.length != 1) {
		System.out.println("Error: Invalid number of params");
		return false;
	    }

	}
	return true;
    }
}
