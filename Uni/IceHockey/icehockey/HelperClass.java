package icehockey;

public class HelperClass {

    

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
