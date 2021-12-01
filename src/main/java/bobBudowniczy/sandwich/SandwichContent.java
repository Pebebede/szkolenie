package bobBudowniczy.sandwich;

import bobBudowniczy.ingredients.*;

import java.util.List;

public class SandwichContent {

    private final BreadType breadType;
    private final SausageType sausageType;
    private final List<IngredientList> ingredientLists;
    private final BakingLevel bakingLevel;
    private final SauceType sauceType;
    private final String sandwichName;

    public SandwichContent(BreadType breadType, SausageType sausageType, List<IngredientList> ingredientLists, BakingLevel bakingLevel, SauceType sauceType, String sandwichName) {
        this.breadType = breadType;
        this.sausageType = sausageType;
        this.ingredientLists = ingredientLists;
        this.bakingLevel = bakingLevel;
        this.sauceType = sauceType;
        this.sandwichName = sandwichName;
    }

    public String getOrderContent() {
        String info = "";
        info += "Sandwich name: " + sandwichName + "\n";
        info += "Bread type: " + breadType + " Allergens: " + new AllergenList().breadAllergen(breadType) + "\n";
        info += "Sausage type: " + sausageType + " Allergens: " + new AllergenList().sausageAllergen(sausageType) + "\n";
        info += "AdditionalIngredients: " + ingredientLists + " Allergens: " + new AllergenList().ingredients(ingredientLists) + "\n";
        info += "Baking level: " + bakingLevel + "\n";
        info += "Sauce type: " + sauceType + " Allergens: " + new AllergenList().sauceAllergen(sauceType) + "\n";
        return info;
    }


}
