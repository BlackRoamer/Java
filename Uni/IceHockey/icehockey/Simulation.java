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
	    if (checkForParamsAddTeamCommand(input)) {
		String[] paramsSplitted = input[1].split(";");
		int Id = parseId(paramsSplitted[0]);
		// try {
		// Id = Integer.parseInt(paramsSplitted[0]);
		// } catch(Exception e) {
		// System.out.println("Error: Invalid ID");
		// return;
		// }
		String teamName = paramsSplitted[1];
		Team newTeam = new Team(Id, teamName);

		System.out.println(newTeam.getID() + newTeam.getName() + "TEXT");
		Teamslist.setAllTeams(newTeam);

	    }
	    break;
	case "list-team":
	    if (checkForParamsListTeamsCommand(input)) {
		for (int i = 0; i < Teamslist.getAllTeams().size(); i++) {
		    int Id = Teamslist.getAllTeams().get(i).getID();
		    String name = Teamslist.getAllTeams().get(i).getName();
		    System.out.println(Id + " " + name);
		}
	    }
	    break;
	case "add-ice-hockey-match":
	    if (checkForParamsAddMatch(input)) {
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
	    System.out.println("Error: Invalid ID");

	}
	return Id;
    }

    private boolean checkForParamsAddTeamCommand(String[] input) {

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

    private boolean checkForParamsListTeamsCommand(String[] input) {
	if (input.length != 1) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	}
	return true;
    }

    private boolean checkForParamsAddMatch(String[] input) {
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

    private boolean checkForParamsPrint(String[] input) {
	if (input.length != 1) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	}
	return true;
    }

    private boolean checkForParamsQuit(String[] input) {
	if (input.length != 1) {
	    System.out.println("Error: Invalid number of params");
	    return false;
	}
	return true;
    }

    private boolean checkForParams(String[] input) {
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