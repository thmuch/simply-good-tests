package sushi.model;

public record OrderNumber(long eightDigits) {

    public OrderNumber {
        if (eightDigits < 10000000L || eightDigits > 19999999L) {
            throw new IllegalArgumentException("Invalid order number: " + eightDigits);
        }
    }
}
