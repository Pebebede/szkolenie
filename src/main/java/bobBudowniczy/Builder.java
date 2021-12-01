package bobBudowniczy;

import bobBudowniczy.ingredients.*;

import java.util.List;

public interface Builder {
    void chooseBread(BreadType breadType);

    void addMainIngredient(SausageType sausageType);

    void addAdditionalIngredients(List<IngredientList> ingredientLists);

    void setBakingLevel(BakingLevel bakingLevel);

    void addSauce(SauceType sauceType);

    void sandwichName(String sandwichName);
}
