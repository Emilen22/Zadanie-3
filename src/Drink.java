public class Drink {
    public static void main(String[] args) {
        DrinkBase drinkBase = new DrinkBase();
        drinkBase.drinkName = "Blue Shark";
        drinkBase.drinkPrice = 7;
        drinkBase.drinkType = "alkoholowy";
        drinkBase.components = new Components();
        drinkBase.components.ingredients = new Ingredients();

        System.out.println("Nazwa: " + drinkBase.drinkName + " " + '(' + drinkBase.drinkType + ')');
        System.out.println("Cena: " + drinkBase.drinkPrice + " zł");
        System.out.println("Składniki:");
        System.out.println("- " + drinkBase.components.component1 +
                " (" + drinkBase.components.metric1 + " ml)");
        System.out.println("- " + drinkBase.components.component2 +
                " (" + drinkBase.components.metric2 + " ml)");
        System.out.println("- " + drinkBase.components.component3 +
                " (" + drinkBase.components.metric3 + " ml)");
        System.out.println("- " + drinkBase.components.component4 +
                " około (" + drinkBase.components.metric4 + " ml)");

        System.out.println("Pojemność drinka około: " + drinkBase.components.metric5 + " ml");
    }
}
