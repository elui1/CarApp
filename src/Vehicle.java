public abstract class Vehicle {
    private String color;
    private String model;

    public Vehicle() {

    }

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String accelerate() {
        return "The vehicle is accelerating";
    }

    public String start() {
        return "The vehicle is starting";
    }

    public String stop() {
        return "The vehicle is stopped";
    }

}
