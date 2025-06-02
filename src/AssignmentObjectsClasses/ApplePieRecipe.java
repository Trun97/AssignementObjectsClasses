package AssignmentObjectsClasses;

public class ApplePieRecipe {
    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient whiteSugar = new Ingredient(200, "gram", "witte basterdsuiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apples = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient crystalSugar = new Ingredient(75, "gram", "kristalsuiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");


    public void printIngredients() {
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(whiteSugar.getAmount() + " " + whiteSugar.getUnit() + " " + whiteSugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(crystalSugar.getAmount() + " " + crystalSugar.getUnit() + " " + crystalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadcrumbs.getAmount() + " " + breadcrumbs.getUnit() + " " + breadcrumbs.getName());
    }

    public void preheatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void prepareEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, de andere helft is voor het bestrijken van de appeltaart.");
    }

    public void makeDough() {
        System.out.println("Meng de boter, basterdsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepareApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void prepareForm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void buildPie() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken en een deel om de rand te bekleden. Strooi het paneermeel op de bodem van de beklede vorm.");
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen.");
        System.out.println("Meng de andere helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void decoratePie() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        System.out.println("Leg de stroken kruislings op de appeltaart en werk de rand af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void bakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven en bak de taart in 60 minuten op 170 graden Celsius gaar en goudbruin.");
    }
}

