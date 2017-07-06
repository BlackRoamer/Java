package kit;

public class LoyalityCard {

private final double discount; 
//it's fixed discount
//it's final and that's why without getter and setter

public LoyalityCard(double discount) {

this.discount = discount;

}
public double getDiscount() {
return discount;
}

}
