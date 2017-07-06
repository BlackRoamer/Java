package kit;

public class Address {

private String streetName;
private int houseNumber;
private int postcode;
private String city;

public Address(String streetName, int houseNumber, int postcode,
		String city) {
	this.streetName = streetName;
	this.houseNumber = houseNumber;
	this.postcode = postcode;
	this.city = city;
}

public String getStreetName() {
return streetName;
}

public void setStreetName(String streetName) {
this.streetName = streetName;
}

public int getHouseNumber() {
return houseNumber;
}

public void setHouseNumber(int houseNumber) {
this.houseNumber = houseNumber;
}

public int getPostcode() {
return postcode;
}

public void setPostcode(int postcode) {
this.postcode = postcode;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}
}
