package food_builder;

public class FoodProduct {
	
	private String name;
	private String type;
	private double weight;
	private double cost;
	private int servings;
	private int calories;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

public void display() {
	System.out.println(name);
	System.out.println(type);
	System.out.println(weight);
	System.out.println(cost);
	System.out.println(servings);
	System.out.println(calories);
	costPerServing();
	totalCalories();
	System.out.println();
}

public void costPerServing() {
	double costPerServing = cost / servings;
	System.out.println(costPerServing);
}

public void totalCalories() {
	double totalCalories = calories * servings;
	System.out.println(totalCalories);

}

	
}
