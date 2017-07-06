package kit;

import java.util.Date;

public class DailyArticle extends Article {

public DailyArticle(String articleName, double price, double weight,
double fillingQuantity, Date dateOfProduction) {
super(articleName, price, weight, fillingQuantity, dateOfProduction);

}

public Date getExpirationDate() {
return super.getDateOfProduction();
// it should return date of prodcution + 2 days
}

/**
 * // check if two days have passed after the production date
 */
@Override
public boolean isExpired() {

return isExpired();
}
}
