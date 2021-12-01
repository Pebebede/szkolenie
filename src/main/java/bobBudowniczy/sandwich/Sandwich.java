package bobBudowniczy.sandwich;

import bobBudowniczy.ingredients.*;

import java.util.List;

public class Sandwich {

    private final BreadType breadType;
    private final SausageType sausageType;
    private final List<IngredientList> ingredientLists;
    private final BakingLevel bakingLevel;
    private final SauceType sauceType;


    private final String sandwichName;

    public Sandwich(BreadType breadType, SausageType sausageType, List<IngredientList> ingredientLists, BakingLevel bakingLevel, SauceType sauceType, String sandwichName) {
        this.breadType = breadType;
        this.sausageType = sausageType;
        this.ingredientLists = ingredientLists;
        this.bakingLevel = bakingLevel;
        this.sauceType = sauceType;
        this.sandwichName = sandwichName;
    }


    public BreadType getBreadType() {
        return breadType;
    }

    public SausageType getSausageType() {
        return sausageType;
    }


    public BakingLevel getBakingLevels() {
        return bakingLevel;
    }

    public SauceType getSauceType() {
        return sauceType;
    }


    public List<IngredientList> getIngredientLists() {
        return ingredientLists;
    }

    public String getSandwichName() {
        return sandwichName;
    }
}
