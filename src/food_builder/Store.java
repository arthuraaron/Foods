package food_builder;

public class Store {

	public static void main(String[] args) {
		
		// Cheese
		FoodProduct cheese = new FoodProduct();
		cheese.setName("Cheese");
		cheese.setType("Dairy");
		cheese.setWeight(500);
		cheese.setCost(3.49);
		cheese.setServings(2);
		cheese.setCalories(120);
		cheese.display();
		
		// Steak
		FoodProduct steak = new FoodProduct();	
		steak.setName("Steak");
		steak.setType("Meat");
		steak.setWeight(1000);
		steak.setCost(5.99);
		steak.setServings(1);
		steak.setCalories(680);
		steak.display();
		
		
		// Orphan Tears
		FoodProduct orphanTears = new FoodProduct();
		orphanTears.setName("Orphan Tears");
		orphanTears.setType("Drink");
		orphanTears.setWeight(250);
		orphanTears.setCost(19.99);
		orphanTears.setServings(1);
		orphanTears.setCalories(20);
		orphanTears.display();
		
		// Milk
		FoodProduct milk = new FoodProduct();
		milk.setName("Milk");
		milk.setType("Drink");
		milk.setWeight(250);
		milk.setCost(0.99);
		milk.setServings(1);
		milk.setCalories(50);
		milk.display();
		
		// Mashed Potatoes
		FoodProduct mashedPotatoes = new FoodProduct();
		mashedPotatoes.setName("Mashed Potatoes");
		mashedPotatoes.setType("Produce");
		mashedPotatoes.setWeight(450);
		mashedPotatoes.setCost(3.99);
		mashedPotatoes.setServings(2);
		mashedPotatoes.setCalories(220);
		mashedPotatoes.display();
		
		// Water
		FoodProduct water = new FoodProduct();
		water.setName("Water");
		water.setType("Drink");
		water.setWeight(250);
		water.setCost(0.99);
		water.setServings(1);
		water.setCalories(0);
		water.display();
		
		
	}


	
}
