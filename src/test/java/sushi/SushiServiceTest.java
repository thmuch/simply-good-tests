package sushi;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SushiServiceTest {

    @Test
//    @DisplayName("orderMenu Returns Valid Order Number")
    void orderMenu_Returns_Valid_Order_Number() {

        // Given (Arrange)

        SushiService sushiService = new SushiService();

        Customer customer = defaultCustomer();
        Menu menu = makiMenu();

        // When (Act)

        OrderNumber orderNumber = sushiService.orderMenu(customer, menu);

        // Then (Assert)

        assertThat(orderNumber).as("...description...").isNotNull();

//        assertThat(orderNumber.eightDigits()).isGreaterThanOrEqualTo(10000000L);
//        assertThat(orderNumber.eightDigits()).isLessThanOrEqualTo(19999999L);

//        assertTrue(orderNumber >= 10000000L);
//        assertTrue(orderNumber <= 19999999L);
    }

    Customer defaultCustomer() {
        Customer customer = new Customer();
        // TODO: maybe use ObjectMother? maybe better use TestDataBuilder? maybe combined?

        customer.setId(12340000L);
        customer.setName("Thomas");

        return customer;
    }

    Menu makiMenu() {
        Menu menu = new Menu();

        menu.setName("Maki");

        return menu;
    }
}