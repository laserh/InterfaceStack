public class Car {
    private String make;
    private float price;
    private int year;

    public Car(String make, float price, int year) {
        this.make = make;
        this.price = price;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public float getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
