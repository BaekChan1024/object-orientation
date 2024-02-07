import beverage.Beverage;

public class Customer {

    /*
    * 손님은 카페테리아를 이용한다.
    * */
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
        System.out.println(cafeteria.order(10000, "americano", Beverage.Size.REGULAR, Beverage.Temperature.HOT));
    }
}
