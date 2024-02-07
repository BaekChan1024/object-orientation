package cashier;

import beverage.Beverage;

public record Order(int money, String menu, Beverage.Size size,
                    Beverage.Temperature temperature) {

    public int getMoney() {
        return money;
    }

    public String getMenu() {
        return menu;
    }

    public Beverage.Size getSize() {
        return size;
    }

    public Beverage.Temperature getTemperature() {
        return temperature;
    }
}
