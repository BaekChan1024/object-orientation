import barista.Barista;
import barista.BaristaA;
import beverage.Beverage;
import cashier.Cashier;
import cashier.CashierA;

public class Cafeteria {

    public Beverage order(int money, String menu, Beverage.Size size, Beverage.Temperature temperature){
        return cashier().makeOrder(money, menu, size, temperature);
    }

    private Barista barista() {
        return new BaristaA();
    }

    private Cashier cashier() {
        return new CashierA(barista());
    }
}
