
public class Pizza {

	private int price;
	private boolean veg;

	private int ExtraCheesePrice = 100;
	private int ExtraToppingsPrice = 150;
	private int BackPackPrice = 20;

	private int basePizzaPrice;

	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded = false;
	private boolean isOptedToTakeaway = false;

	public Pizza(boolean veg) {
		this.veg = veg;

		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}

		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {

		isExtraCheeseAdded = true;
		this.price += ExtraCheesePrice;
	}

	public void addExtraToppings() {

		isExtraToppingAdded = true;
		this.price += ExtraToppingsPrice;
	}

	public void takeaway() {

		isOptedToTakeaway = true;
		this.price += BackPackPrice;
	}

	public void getBill() {

		String Bill = "";

		System.out.println("Pizza :" + basePizzaPrice);

		if (isExtraCheeseAdded) {
			Bill += "Extra Cheese Added : " +ExtraCheesePrice+"\n";
		}

		if (isExtraToppingAdded) {
			Bill += "Extra Topping Added : "+ ExtraToppingsPrice+ "\n";
		}
		
		if (isOptedToTakeaway) {
			Bill += "TakeAway : "+ BackPackPrice+ "\n";
		}
		
		Bill += "Bill : "+this.price+ "\n";
		System.out.println(Bill);
	}
}