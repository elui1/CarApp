public class Car extends Vehicle {
    private String color;
    private String model;
    private int speed;

    public Car() {

    }

    public Car(String color, String model, int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String accelerate() {
        return "The " + getColor() + " " + getModel() + " is accelerating";
    }

    @Override
    public String start() {
        return "The " + getColor() + " " + getModel() + " is starting";
    }

    public String setSpeed(int speed) {
        this.speed = speed;
        return "The " + getColor() + " " + getModel() + " is going " + this.speed + " mph";
    }

    public String stop() {
        return "The " + getColor() + " " + getModel() + " is stopped";
    }



}
