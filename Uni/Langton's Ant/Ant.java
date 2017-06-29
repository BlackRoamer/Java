package edu.kit.informatik;

import java.util.ArrayList;
import java.util.List;

public class Ant {
private String name;
private String direction = "";
private int antPosX = 0;
private int antPosY = 0;

// Here i make list , that will save names of ants
private List<String> antNames = new ArrayList<>();

/**
 * This is consturctor which take name and 
 * decide which direction to set and if the name is valid
 * @param name
 */
public Ant(String name) {
char firstLetter = name.charAt(0);
if (name.length() == 1) {


//Here i make check if the letter is lower or upper
if (firstLetter >= 65 && firstLetter <= 90) {
this.direction = Direction.N.name();
}  else if (firstLetter >= 97 && firstLetter <= 122) {
this.direction = Direction.S.name();
}
} else {
Terminal.printError("Invalid name");
}

setName(name);
antNames.add(name);

}

public List<String> getAntNames() {
return antNames;
}

public int getAntPosX() {
return antPosX;
}
public void setAntPosX(int antPosX) {
this.antPosX = antPosX;
}
public int getAntPosY() {
return antPosY;
}
public void setAntPosY(int antPosY) {
this.antPosY = antPosY;
}
public String getName() {
return name;
}

public void setName(String name)  {
if (antNames.size() > 0 ) {
for (int k = 0; k < antNames.size(); k++) {
if (antNames.get(k).equalsIgnoreCase(name)) {
Terminal.printError("Existing name");
} else {
this.name = name;
}
}
} else {
this.name = name;
}

}
public void setDirection(String direction) {
this.direction = direction;
}
public String getDirection() {
return direction;
}

}