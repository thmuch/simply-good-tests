package sushi.service;

import org.junit.jupiter.api.Test;
import sushi.model.Customer;
import sushi.model.Menu;

import static org.assertj.core.api.Assertions.assertThat;

class SushiServiceTest {

    @Test
    void orderMenuShouldReturnValidOrderNumber() {

        SushiService sushiService = new SushiService();

        Customer customer = new Customer();
        Menu menu = new Menu();

        long orderNumber = sushiService.orderMenu(customer, menu);

        assertThat(orderNumber).isGreaterThanOrEqualTo(10000000L);
        assertThat(orderNumber).isLessThanOrEqualTo(19999999L);
    }
}
