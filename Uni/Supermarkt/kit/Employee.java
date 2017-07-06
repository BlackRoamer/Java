package kit;

public class Employee {
private String name;
private int Id;
private Address address;

public Employee(String name, int Id, Address address) {
this.name = name;
this.Id = Id;
this.address = address;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return Id;
}
public void setId(int id) {
Id = id;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public void issueALoyalityCard(Customer customer, LoyalityCard loyalityCard) {
if (customer.hasALoyalityCard() == false) {
// issue a loyalityCard
} else {
// don't make loyalitycard
}
}

}
