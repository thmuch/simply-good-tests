package sushi.service;

import sushi.model.Customer;
import sushi.model.Menu;

public class SushiService {

    public long orderMenu(Customer customer, Menu menu) {
//        return 0L;
//        return 10000000L;
        return customer.getId(); // Ooooops. A Bug! ;-)
    }
}
