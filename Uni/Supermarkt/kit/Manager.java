package kit;

import java.util.List;

public class Manager extends Employee {

public Manager(String name, int Id, Address address) {
super(name, Id, address);
}

public void openTheStore(Supermarket supermarket) {
// Manager open the supermarket if it's closed
}

public void closeTheStore(Supermarket supermarket) {
// Manager close the supermarket if it's opened
}

public void orderItems(List<Article> articles, Supermarket supermarket) {
// Manager order items for his supermarket
}
}
