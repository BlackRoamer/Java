package kit;

import java.util.Date;

public class Article {

	private String articleName = "";
	private double price = 0;
	private double weight = 0;
	private double fillingQuantity = 0;
	private Date dateOfProduction;

	public Article(String articleName, double price, double weight,
double fillingQuantity, Date dateOfProduction) {
		this.articleName = articleName;
		this.price = price;
		this.weight = weight;
		this.fillingQuantity = fillingQuantity;
		this.dateOfProduction = dateOfProduction;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getFillingQuantity() {
		return fillingQuantity;
	}

	public void setFillingQuantity(double fillingQuantity) {
		this.fillingQuantity = fillingQuantity;
	}

	public boolean isExpired() {
		// it check if the Date of expiration is valid
		return false;
	}

	public Date getDateOfProduction() {
		return dateOfProduction;
	}

	public void setDateOfProduction(Date dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
	}
}
