package sushi.service;

import org.junit.jupiter.api.Test;
import sushi.model.Customer;
import sushi.model.Menu;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SushiServiceTest {

    @Test
    void testOrderMenu() {

        SushiService sushiService = new SushiService();

        Customer customer = new Customer();
        Menu menu = new Menu();

        long orderNumber = sushiService.orderMenu(customer, menu);

        assertTrue(orderNumber >= 10000000L);
        assertTrue(orderNumber <= 19999999L);
    }
}
