package kit;

import java.util.Date;
import java.util.HashMap;

public class FreezerArticle extends Article {

// The string in hashmap requires Fridge or freezer
// it's final , because it's constant for fridge/frezezer
private final HashMap<String, Date> expiryDate;
// Here we can make another HashMap , that can be connected 
// with days and temperature
// For example one article can stay in freezer 
// 10 days at temperature -2Grad

public FreezerArticle(String articleName, double price,
double weight, double fillingQuantity,
HashMap<String, Date> expiryDate, Date dateOfProduction) {
super(articleName, price, weight, fillingQuantity, dateOfProduction);
this.expiryDate = expiryDate;
}

public HashMap<String, Date> getExpiryDate() {
return expiryDate;
}
/**
 * check if current date is after the expiration date
 */
@Override
	public boolean isExpired() {
		
		return isExpired();
	}

}
