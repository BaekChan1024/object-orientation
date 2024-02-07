package beverage;

public abstract class Beverage {

    protected Size size;
    protected Temperature temperature;

    public Beverage(Size size, Temperature temperature) {
        this.size = size;
        this.temperature = temperature;
    }

    public Size getSize() {
        return size;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public enum Size {
        REGULAR,
        LARGE
    }

    public enum Temperature {
        HOT,
        COLD
    }
}
