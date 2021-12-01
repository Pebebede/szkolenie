package bobBudowniczy.sandwich;

import bobBudowniczy.Builder;
import bobBudowniczy.ingredients.*;

import java.util.List;

public class SandwichBuilder implements Builder {
    private BreadType breadType;
    private SausageType sausageType;
    private List<IngredientList> ingredientLists;
    private BakingLevel bakingLevel;
    private SauceType sauceType;
    private String sandwichName;


    @Override
    public void chooseBread(BreadType breadType) {
        this.breadType = breadType;
    }

    @Override
    public void addMainIngredient(SausageType sausageType) {
        this.sausageType = sausageType;
    }

    @Override
    public void addAdditionalIngredients(List<IngredientList> ingredientLists) {
        this.ingredientLists = ingredientLists;
    }

    @Override
    public void setBakingLevel(BakingLevel bakingLevel) {
        this.bakingLevel = bakingLevel;
    }

    @Override
    public void addSauce(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    @Override
    public void sandwichName(String sandwichName) {
        this.sandwichName = sandwichName;
    }


    public Sandwich getResult() {
        return new Sandwich(breadType, sausageType, ingredientLists, bakingLevel, sauceType, sandwichName);
    }
}
