package cashier;

import beverage.Beverage;

/*
* 캐시어의 역할
* 1. 커피 주문을 받는다.
* 2. 주문 내역이 기록된 컵을 전달한다.
* */
public interface Cashier {

    Beverage makeOrder(int money, String menu, Beverage.Size size, Beverage.Temperature temperature);
}
