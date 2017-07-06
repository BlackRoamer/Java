package kit;

import java.util.List;

public class ShoppingCart {

private Customer customer;
private List<Article> articles;

private boolean isUsed= false;

public Customer getCustomer() {
return customer;
}

public void setCustomer(Customer customer) {
this.customer = customer;
}

public boolean isUsed() {
return isUsed;
}

public void setUsed(boolean isUsed) {
this.isUsed = isUsed;
}

public List<Article> getArticles() {
return articles;
}

public void setArticles(List<Article> articles) {
this.articles = articles;
}

public void setCustomerToCart(Customer customer) {
if (isUsed == false) {
this.customer = customer;
}
}
}
