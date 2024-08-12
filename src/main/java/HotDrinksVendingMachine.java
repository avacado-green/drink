import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrink> drinks;

    public HotDrinksVendingMachine() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink(HotDrink drink) {
        drinks.add(drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}

