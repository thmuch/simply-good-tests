package sushi.service;

import sushi.model.Customer;
import sushi.model.Menu;
import sushi.model.OrderNumber;

public class SushiService {

    public OrderNumber orderMenu(Customer customer, Menu menu) {
//        return 0L;
//        return 10000000L;
//        return customer.getId(); // Ooooops. A Bug! ;-)
        return new OrderNumber(10000000L);
    }
}
