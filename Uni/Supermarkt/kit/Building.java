package kit;

public class Building {

private Address address;

// There is no building without address
public Building(Address address) {
this.address = address;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}
}
