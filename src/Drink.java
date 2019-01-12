public class Drink {
    public static void main(String[] args) {
        DrinkBase drinkBase = new DrinkBase();
        drinkBase.drinkName = "Blue Shark";
        drinkBase.drinkPrice = "7";
        drinkBase.drinkType = "alkoholowy";
        drinkBase.components = new Components();
        drinkBase.components.component1 = "Wódka";
        drinkBase.components.component2 = "Tequila";
        drinkBase.components.component3 = "Likier blue curacao";
        drinkBase.components.component4 = "Kruszony lód";
        drinkBase.components.ingredients = new Ingredients();
        drinkBase.components.ingredients.metric1 = 25;
        drinkBase.components.ingredients.metric2 = 15;
        drinkBase.components.ingredients.metric3 = 15;
        drinkBase.components.ingredients.metric4 = 50;
        drinkBase.components.ingredients.metric5 =
                drinkBase.components.ingredients.metric1 +
                        drinkBase.components.ingredients.metric2 +
                                drinkBase.components.ingredients.metric3 +
                                        drinkBase.components.ingredients.metric4;

        System.out.println("Nazwa: " + drinkBase.drinkName + " " + '(' + drinkBase.drinkType + ')');
        System.out.println("Cena: " + drinkBase.drinkPrice + " zł");
        System.out.println("Składniki:");
        System.out.println("- " + drinkBase.components.component1 +
                " (" + drinkBase.components.ingredients.metric1 + " ml)");
        System.out.println("- " + drinkBase.components.component2 +
                " (" + drinkBase.components.ingredients.metric2 + " ml)");
        System.out.println("- " + drinkBase.components.component3 +
                " (" + drinkBase.components.ingredients.metric3 + " ml)");
        System.out.println("- " + drinkBase.components.component4 +
                " około (" + drinkBase.components.ingredients.metric4 + " ml)");

        System.out.printf("Pojemność drinka około: " + drinkBase.components.ingredients.metric5 + " ml");
    }
}
