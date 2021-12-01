package bobBudowniczy.ingredients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionalIngredients {

    private IngredientList[] ingredientLists;

    public AdditionalIngredients(IngredientList... ingredientLists) {
        this.ingredientLists = ingredientLists;
    }

    public List<IngredientList> get() {
        return new ArrayList<>(Arrays.asList(ingredientLists));
    }
}
