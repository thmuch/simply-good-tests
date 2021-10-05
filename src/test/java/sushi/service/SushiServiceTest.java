package sushi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sushi.model.Customer;
import sushi.model.Menu;

import static org.assertj.core.api.Assertions.assertThat;

class SushiServiceTest {

    @Test
    void orderMenuShouldReturnValidOrderNumber() {

        SushiService sushiService = new SushiService();

        Customer customer = defaultCustomer();
        Menu menu = makiMenu();

        long orderNumber = sushiService.orderMenu(customer, menu);

        assertThat(orderNumber).isGreaterThanOrEqualTo(10000000L);
        assertThat(orderNumber).isLessThanOrEqualTo(19999999L);
    }

    private Customer defaultCustomer() {
        Customer customer = new Customer();

        customer.setId(1234L);
        customer.setName("Thomas");

        return customer;
    }

    private Menu makiMenu() {
        Menu menu = new Menu();

        menu.setName("Maki");

        return menu;
    }
}
