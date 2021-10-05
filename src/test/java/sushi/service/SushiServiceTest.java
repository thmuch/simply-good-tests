package sushi.service;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import sushi.model.Customer;
import sushi.model.Menu;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SushiServiceTest {

    @Test
//    @DisplayName("orderMenu returns valid order number")
    void orderMenu_returns_valid_order_number() {

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
