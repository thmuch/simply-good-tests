package sushi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sushi.model.Customer;
import sushi.model.Menu;

import static org.assertj.core.api.Assertions.assertThat;

class SushiServiceTest {

    private Customer customer;
    private Menu menu;

    @BeforeEach
    void setup() {
        customer = new Customer();

        customer.setId(1234L);
        customer.setName("Thomas");

        menu = new Menu();

        menu.setName("Maki");
    }

    @Test
    void orderMenuShouldReturnValidOrderNumber() {

        SushiService sushiService = new SushiService();

        long orderNumber = sushiService.orderMenu(customer, menu);

        assertThat(orderNumber).isGreaterThanOrEqualTo(10000000L);
        assertThat(orderNumber).isLessThanOrEqualTo(19999999L);
    }
}
