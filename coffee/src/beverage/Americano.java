package beverage;

public class Americano extends Beverage {

    private int price;

    public Americano(int price, Size size, Temperature temperature) {
        super(size, temperature);
        if (this.price > price) {
            throw new RuntimeException();
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Americano{" +
                "price=" + price +
                ", size=" + size +
                ", temperature=" + temperature +
                '}';
    }
}
