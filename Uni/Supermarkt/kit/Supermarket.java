package kit;

import java.util.List;

public class Supermarket extends Building {

private List<Till> tills;
private List<Employee> employees;
private List<Article> articles;
private List<Customer> customers;

public Supermarket(Address address) {
super(address);
}

public List<Till> getTills() {
return tills;
}

public void setTills(List<Till> tills) {
this.tills = tills;
}

public List<Employee> getEmployees() {
return employees;
}

public void setEmployees(List<Employee> employees) {
this.employees = employees;
}

public List<Article> getArticles() {
return articles;
}

public void setArticles(List<Article> articles) {
this.articles = articles;
}

public List<Customer> getCustomers() {
return customers;
}

public void setCustomers(List<Customer> customers) {
this.customers = customers;
}

}
