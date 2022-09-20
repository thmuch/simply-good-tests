package sushi;

public record OrderNumber(long eightDigits) {

    public OrderNumber {
        if (eightDigits < 10000000L || eightDigits > 19999999L) {
            throw new IllegalArgumentException("Wrong order number: " + eightDigits);
        }
    }
}
