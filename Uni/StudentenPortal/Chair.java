package portal;

public class Chair {

    private String name;

    public Chair(String name) {
	setName(name);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name.toLowerCase();
    }

}
