package icehockey;

import java.util.Scanner;

public class Simulation {

    /*
     * SAMPLE INPUT
     *  > add-team 11;abcd OK > add-team 13;ijkl OK > add-team
     * 12;efgh OK > add-team 14;mnop OK > list-team 11 abcd 12 efgh 13 ijkl 14
     * mnop
     */

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
	    if (HelperClass.checkForParamsAddTeamCommand(input)) {
		String[] paramsSplitted = input[1].split(";");
		
		int Id = parseId(paramsSplitted[0]);
		String teamName = paramsSplitted[1];
		
		if(HelperClass.checkConstructorParams(Id, teamName)) {
		    Team newTeam = new Team(Id, teamName);   
		    if (HelperClass.checkForExistingTeams(newTeam)) {
		    Teamslist.setAllTeams(newTeam);
		    System.out.println("Ok");
		    }
		}
		
	    }
	    break;
	case "list-team":
	    if (HelperClass.checkForParamsListTeamsCommand(input)) {
		for (int i = 0; i < Teamslist.getAllTeams().size(); i++) {
		    int Id = Teamslist.getAllTeams().get(i).getID();
		    String name = Teamslist.getAllTeams().get(i).getName();
		    System.out.println(Id + " " + name);
		}
	    }
	    break;
	case "add-ice-hockey-match":
	    if (HelperClass.checkForParamsAddMatch(input)) {
		String[] paramsSplitted = input[1].split(";");

	    }

	default:
	    System.out.println("Error: Invalid command");
	}

    }

    private int parseId(String params) {
	int Id = -1;
	try {
	    Id = Integer.parseInt(params);
	} catch (Exception e) {
	    System.out.println("ID can't be parsed");

	}
	return Id;
    }

 
}