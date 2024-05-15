
public class Main {

	public static void main(String[] args) {
		
//		Pizza basePizza=new Pizza(false);
//		basePizza.addExtraCheese();
//		basePizza.addExtraToppings();
//		basePizza.takeaway();
//		basePizza.getBill();
		
		DeluxPizza dPizza=new DeluxPizza(false);
		dPizza.takeaway();
		dPizza.getBill();
	}
}
