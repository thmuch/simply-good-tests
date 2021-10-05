package sushi.model;

import java.util.Objects;

public final class OrderNumber {

    private final long eightDigits;

    public OrderNumber(long eightDigits) {
        this.eightDigits = eightDigits;
    }

    public long eightDigits() {
        return eightDigits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderNumber that = (OrderNumber) o;
        return eightDigits == that.eightDigits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eightDigits);
    }

    @Override
    public String toString() {
        return "OrderNumber{" +
                "eightDigits=" + eightDigits +
                '}';
    }
}
