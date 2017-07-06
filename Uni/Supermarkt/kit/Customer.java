package kit;

import java.util.List;

public class Customer {

private boolean hasAShoppingCart = false;
private LoyalityCard loyalityCard;
private boolean hasALoyalityCard = false;
private ShoppingCart shoppingCart;

// Customer without LoyalityCard
public Customer() {

}

// Customer with loyalityCard
public Customer(LoyalityCard loyalityCard) {
this.loyalityCard = loyalityCard;
hasALoyalityCard = true;
}

public boolean HasAShoppingCart() {
return hasAShoppingCart;
}

public void setAShoppingCart(boolean hasAShoppingCart) {
this.hasAShoppingCart = hasAShoppingCart;
}

public LoyalityCard getLoyalityCard() {
return loyalityCard;
}

public void setLoyalityCard(LoyalityCard loyalityCard) {
this.loyalityCard = loyalityCard;
}

public void setItemsInShoppingCart(Article article) {
if (hasAShoppingCart == true) {
// people set item in the shoppingCart
} else {
// clients don't have shoppingCart , so they can't do it
}
}
public void setItemsInShoppingCart(List<Article> articles) {
if (hasAShoppingCart == true) {
// people set items in the shoppingCart
} else {
// clients don't have shoppingCart , so they can't do it
}
}

public void payAtTill() {
// Customer pay at Till
}

public boolean hasALoyalityCard() {
return hasALoyalityCard;
}

public void getAShoppingCart(ShoppingCart shoppingCart) {
if (shoppingCart.isUsed() == false) {
this.setShoppingCart(shoppingCart);
}
}

public void setALoyalityCard(boolean hasALoyalityCard) {
this.hasALoyalityCard = hasALoyalityCard;
}


public ShoppingCart getShoppingCart() {
return shoppingCart;
}

public void setShoppingCart(ShoppingCart shoppingCart) {
this.shoppingCart = shoppingCart;
}

}
