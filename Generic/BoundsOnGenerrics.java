// Bounded type parameter
 class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}

public class BoundsOnGenerrics {
    public static void main(String[] args) {
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setNumber(42);
        System.out.println("Number: " + integerBox.getNumber());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setNumber(3.14);
        System.out.println("Number: " + doubleBox.getNumber());
    }
}
