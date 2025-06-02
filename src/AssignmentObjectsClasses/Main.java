package AssignmentObjectsClasses;

public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();

        recipe.printIngredients();
        System.out.println();

        recipe.preheatOven();
        recipe.prepareEgg();
        recipe.makeDough();
        recipe.prepareApples();
        recipe.prepareForm();
        recipe.buildPie();
        recipe.decoratePie();
        recipe.bakePie();
    }
}
