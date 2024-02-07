package barista;

import beverage.Americano;
import beverage.Beverage;
import cashier.Order;

public class BaristaA implements Barista{

    @Override
    public Beverage makeBeverage(Order order) {
        if (order.getMenu().equals("americano")) {
            return new Americano(order.getMoney(), order.getSize(), order.getTemperature());
        }
        return null;
    }
}
