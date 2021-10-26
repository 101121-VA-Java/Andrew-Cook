package models;

		import com.revature.interfaces.*;

		import java.util.Arrays;

		public class Foods implements Ingredients {
			public string ingredients;
			public int numberOfIngredients;
			public String seasonName;
			String[] foodNames = {"Burger", "Tacos", "Pizza"};
			private Object Food;
			private Object ingredientsName;

			public Foods() {
			}

			public Foods(String foodName, String ingredient, int averageTemperature) {
				this.ingredientsName = ingredientsName;
				this.Food = Food;
			}
				
				switch (foodName) {
				case "Burger":
					ingredients = "Bun, tomato, patty";
					return ingredients;
				case "Pizza":
					ingredientsName = "Rainy";
					return seasonName;
				case "Tacos":
					ingredientsName = "Snowy";
					return seasonName;
			
					return seasonName;
				default:
					throw new IllegalStateException("Unexpected value: " + Arrays.toString(FoodNames));
				}
			}

			public void weatherChange(String weather) {
				this.weather = weather;
			}

			public int averageTemperature(String seasonName) {
				switch (seasonName) {
				case "Summer":
					return 75;
				case "Fall":
					return 55;
				case "Winter":
					return 45;
				case "Spring":
					return 65;
				default:
					throw new IllegalStateException("Unexpected value: " + Arrays.toString(fourSeasonTemperatures));
					
				}
			}
			
			
			
		}
	}

}
