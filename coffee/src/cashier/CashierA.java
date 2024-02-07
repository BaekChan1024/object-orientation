package cashier;

import barista.Barista;
import beverage.Beverage;

public class CashierA implements Cashier{

    private final Barista barista;

    public CashierA(Barista barista) {
        this.barista = barista;
    }

    @Override
    public Beverage makeOrder(int money, String menu, Beverage.Size size, Beverage.Temperature temperature) {
        return barista.makeBeverage(new Order(money, menu, size, temperature));
    }
}
