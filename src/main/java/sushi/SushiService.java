package sushi;

public class SushiService {

    public OrderNumber orderMenu(Customer customer, Menu menu) {
//        return 0L;
//        return 10000000L;
//        return customer.getId(); // Oops, a bug ;-)
        return new OrderNumber(12340000L);
    }
}
