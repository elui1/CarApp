public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Viper");
        car1.setColor("red");

        Car car2 = new Car();
        car2.setModel("Porsche");
        car2.setColor("yellow");

        System.out.println(car1.start());
        System.out.println(car2.start());
        System.out.println(car1.accelerate());
        System.out.println(car2.accelerate());
        System.out.println(car1.setSpeed(50));
        System.out.println(car1.stop());
        System.out.println("The " + car2.getColor() + " " + car2.getModel()
                + " just passed the " + car1.getColor() + " " + car1.getModel());

    }
}
