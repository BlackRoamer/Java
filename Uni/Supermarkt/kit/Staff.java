package kit;

import java.util.List;

public class Staff extends Employee {

public Staff(String name, int Id, Address address) {
super(name, Id, address);
}

public void restockItems(List<Article> articles) {
// Staff order the items
}

public void speakWithClients(Customer customer) {
// Staff speaks with clients
}

}
