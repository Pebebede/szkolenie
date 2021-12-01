package bobBudowniczy;

import bobBudowniczy.ingredients.*;

public class ProductionManager {


    public void prepareBossSandwich(Builder builder) {
        builder.chooseBread(BreadType.BRIGHT_BREAD);
        builder.addMainIngredient(SausageType.BEEF);
        builder.addAdditionalIngredients(new AdditionalIngredients(IngredientList.BACON, IngredientList.CHEESE, IngredientList.HOT_PEPPER, IngredientList.ONION).get());
        builder.setBakingLevel(BakingLevel.STRONGLY_BAKED);
        builder.addSauce(SauceType.CHILLI_SAUCE);
        builder.sandwichName("Boss Sandwich");

    }

    public void prepareVeganDuty(Builder builder) {
        builder.chooseBread(BreadType.GLUTEN_FREE_BREAD);
        builder.addMainIngredient(SausageType.VEGAN_MEAT);
        builder.addAdditionalIngredients(new AdditionalIngredients(IngredientList.HOT_PEPPER, IngredientList.ONION).get());
        builder.setBakingLevel(BakingLevel.LIGHTLY_BAKED);
        builder.addSauce(SauceType.BASIL_SAUCE);
        builder.sandwichName("Vegan Duty");
    }

    public void prepareVegetableMadness(Builder builder) {
        builder.chooseBread(BreadType.DARK_BREAD);
        builder.addMainIngredient(SausageType.VEGETABLE_MEAT);
        builder.addAdditionalIngredients(new AdditionalIngredients(IngredientList.CHEESE, IngredientList.ONION).get());
        builder.setBakingLevel(BakingLevel.INTERMEDIATE_BAKED);
        builder.addSauce(SauceType.TOMATO_SAUCE);
        builder.sandwichName("VegetableMadness");
    }

    public void prepareFarmOrgy(Builder builder) {
        builder.chooseBread(BreadType.BRIGHT_BREAD);
        builder.addMainIngredient(SausageType.CHICKEN);
        builder.addAdditionalIngredients(new AdditionalIngredients(IngredientList.BACON, IngredientList.CHEESE, IngredientList.ONION).get());
        builder.setBakingLevel(BakingLevel.LIGHTLY_BAKED);
        builder.addSauce(SauceType.BBQ_SAUCE);
        builder.sandwichName("Farm Orgy");
    }
}
