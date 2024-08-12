public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 250, 80);
        HotDrink coffee = new HotDrink("Coffee", 200, 90);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 300, 85);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.addDrink(tea);
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(hotChocolate);

        HotDrink requestedDrink = vendingMachine.getProduct("Coffee", 200, 90);
        if (requestedDrink != null) {
            System.out.println("Выданный напиток: " + requestedDrink);
        } else {
            System.out.println("Напиток не найден.");
        }
    }
}

