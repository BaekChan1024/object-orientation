package barista;

import beverage.Beverage;
import cashier.Order;

/*
* 바리스타의 역할
 * 1. 캐시어에게 주문 내역이 기록된 컵을 받는다.
 * 2. 커피를 제조한 후 제조가 완료됐음을 캐시어에게 알려준다.
* */
public interface Barista {

    Beverage makeBeverage(Order order);
}
