package sushi.service;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import sushi.model.Customer;
import sushi.model.Menu;
import sushi.model.OrderNumber;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SushiServiceTest {

    @Test
    void orderMenu_returns_valid_order_number() {

        // Given (Arrange)

        SushiService sushiService = new SushiService();

        Customer customer = defaultCustomer();
        Menu menu = makiMenu();

        // When (Act)

        OrderNumber orderNumber = sushiService.orderMenu(customer, menu);

        // Then (Assert)

        assertThat(orderNumber).isNotNull();
    }

    private Customer defaultCustomer() {
        Customer customer = new Customer();

        customer.setId(12340000L);
        customer.setName("Thomas");

        return customer;
    }

    private Menu makiMenu() {
        Menu menu = new Menu();

        menu.setName("Maki");

        return menu;
    }
}
