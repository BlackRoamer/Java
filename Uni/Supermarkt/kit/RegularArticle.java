package kit;

import java.util.Date;

public class RegularArticle extends Article {

	// it's constant and that's why no setter
	private final Date expiryDate;

	public RegularArticle(String articleName, double price, double weight,
double fillingQuantity, Date expiryDate) {
		super(articleName, price, weight, fillingQuantity, expiryDate);
		this.expiryDate = expiryDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * check if current date is after the expiration dare
	 */
	@Override
	public boolean isExpired() {

		return isExpired();
	}
}
