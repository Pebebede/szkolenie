package bobBudowniczy;

import bobBudowniczy.sandwich.Sandwich;
import bobBudowniczy.sandwich.SandwichBuilder;
import bobBudowniczy.sandwich.SandwichContent;
import bobBudowniczy.sandwich.SandwichContentBuilder;

public class Customer {


    public static void main(String[] args) {

        ProductionManager productionManager = new ProductionManager();
        SandwichBuilder builder = new SandwichBuilder();
        productionManager.prepareBossSandwich(builder);
        Sandwich sandwich = builder.getResult();
        System.out.println("Stworzono kanapke: " + sandwich.getSandwichName());

        SandwichContentBuilder sandwichContentBuilder = new SandwichContentBuilder();

        productionManager.prepareBossSandwich(sandwichContentBuilder);
        SandwichContent sandwichContent = sandwichContentBuilder.getResult();
        System.out.println(sandwichContent.getOrderContent());

        productionManager.prepareVeganDuty(sandwichContentBuilder);
        SandwichContent sandwichContent1 = sandwichContentBuilder.getResult();
        System.out.println(sandwichContent1.getOrderContent());
    }
}

