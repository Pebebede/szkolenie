package bobBudowniczy.ingredients;

import java.util.List;

public class AllergenList {

    public String breadAllergen(BreadType breadType) {
        String allergen = "";
        if (breadType.equals(BreadType.BRIGHT_BREAD)) {
            allergen = "gluten, wheat, ";
        }
        if (breadType.equals(BreadType.DARK_BREAD)) {
            allergen = "gluten, sesame, ";
        }
        if (breadType.equals(BreadType.GLUTEN_FREE_BREAD)) {
            allergen = "No allergens, ";
        }
        if (breadType.equals(BreadType.WHEAT_BREAD)) {
            allergen = "gluten, wheat, soy, ";
        }
        return allergen;

    }

    public String sausageAllergen(SausageType sausageType) {
        String allergen = "";
        if (sausageType.equals(SausageType.BEEF)) {
            allergen = "egg, soybean oil, ";
        }
        if (sausageType.equals(SausageType.CHICKEN)) {
            allergen = "peanuts, milk, ";
        }
        if (sausageType.equals(SausageType.PORK)) {
            allergen = "religion, ";
        }
        if (sausageType.equals(SausageType.VEGAN_MEAT)) {
            allergen = "soy, ";
        }
        if (sausageType.equals(SausageType.VEGETABLE_MEAT)) {
            allergen = "eggs, milk, peanuts, ";
        }

        return allergen;
    }

    public String ingredients(List<IngredientList> list) {
        StringBuilder allergen = new StringBuilder();
        for (IngredientList ingredients : list) {
            if (ingredients.equals(IngredientList.BACON)) {
                allergen.append(ingredients).append(":egg, palm oil, ");
            }
            if (ingredients.equals(IngredientList.CHEESE)) {
                allergen.append(ingredients).append(":milk, ");
            }
            if (ingredients.equals(IngredientList.ONION)) {
                allergen.append(ingredients).append(":no allergens, ");
            }
            if (ingredients.equals(IngredientList.HOT_PEPPER)) {
                allergen.append(ingredients).append(":sesame, oil, ");
            }


        }
        return allergen.toString();
    }

    public String sauceAllergen(SauceType sauceType) {
        String allergen = "";
        if (sauceType.equals(SauceType.BASIL_SAUCE)) {
            allergen = "sesame, ";
        }
        if (sauceType.equals(SauceType.BBQ_SAUCE)) {
            allergen = "fish, eggs, ";
        }
        if (sauceType.equals(SauceType.CHILLI_SAUCE)) {
            allergen = "sesame, peanuts, soy";
        }
        if (sauceType.equals(SauceType.TOMATO_SAUCE)) {
            allergen = "No allergens";
        }
        return allergen;
    }
}

