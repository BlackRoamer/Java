package icehockey;

import java.util.Scanner;

public class Simulation {

    public void runSimulation() {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	while (!input.equals("quit")) {
	    String[] splittedInput = input.split(" ");
	    String command = splittedInput[0];
	    run(command, splittedInput);
	    input = scan.nextLine();
	}

    }

    private void run(String command, String[] input) {

	switch (command) {
	case "add-team":
	    addTeam(input);
	    break;

	case "list-team":
	    listTeams(input);
	    break;

	case "add-ice-hockey-match":
	    addMatch(input);
	    break;

	case "print-del-standings":
	    printStandings();
	    break;

	default:
	    System.out.println("Error: Invalid command");
	}

    }

    private void printStandings() {
	for (int i = 0; i < HelperClass.sortTeamsByPoints().size(); i++) {
	    int index = i + 1;
	    System.out.println(index + " " + HelperClass.sortTeamsByPoints().get(i).getName() + " "
		    + HelperClass.sortTeamsByPoints().get(i).getPoints() + " "
		    + HelperClass.sortTeamsByPoints().get(i).getGoals());
	}

    }

    private void addMatch(String[] input) {
	if (HelperClass.checkForParamsAddMatch(input)) {
	    String[] paramsSplitted = input[1].split(";");
	    int firstTeamId = HelperClass.parseId(paramsSplitted[0]);
	    int secondTeamId = HelperClass.parseId(paramsSplitted[2]);
	    if (HelperClass.checkForRegisteredTeam(firstTeamId) && HelperClass.checkForRegisteredTeam(secondTeamId)) {
		int firstTeamScore = HelperClass.parseScore(paramsSplitted[1]);
		int secondTeamScore = HelperClass.parseScore(paramsSplitted[3]);
		int gameTime = HelperClass.parseTime(paramsSplitted[4]);
		if (HelperClass.checkForGameTime(gameTime)) {
		    Team firstTeam = HelperClass.findTeamById(firstTeamId);
		    Team secondTeam = HelperClass.findTeamById(secondTeamId);
		    if (HelperClass.checkForPositiveScore(firstTeamScore)
			    && HelperClass.checkForPositiveScore(secondTeamScore)) {
			if (HelperClass.checkForValidGame(firstTeamScore, secondTeamScore, gameTime)) {
			    HelperClass.calculatePoints(firstTeam, firstTeamScore, secondTeam, secondTeamScore,
				    gameTime);
			    System.out.println("Ok");
			}
		    }
		}
	    }
	}
    }

    private void listTeams(String[] input) {
	if (HelperClass.checkForParamsListTeamsCommand(input)) {
	    for (int i = 0; i < Teamslist.getAllTeams().size(); i++) {
		int Id = Teamslist.getAllTeams().get(i).getID();
		String name = Teamslist.getAllTeams().get(i).getName();
		System.out.println(Id + " " + name);
	    }
	}
    }

    private void addTeam(String[] input) {
	if (HelperClass.checkForParamsAddTeamCommand(input)) {
	    String[] paramsSplitted = input[1].split(";");

	    int Id = HelperClass.parseId(paramsSplitted[0]);
	    String teamName = paramsSplitted[1];

	    if (HelperClass.checkConstructorParams(Id, teamName)) {
		Team newTeam = new Team(Id, teamName);
		if (HelperClass.checkForExistingTeams(newTeam)) {
		    Teamslist.setAllTeams(newTeam);
		    System.out.println("Ok");
		}
	    }

	}
    }

}