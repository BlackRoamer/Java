package portal;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
	setFirstName(firstName);
	setLastName(lastName);
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {

	this.firstName = firstName.toLowerCase();
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName.toLowerCase();
    }

}
