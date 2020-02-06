import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Plane p = new Plane();
        Boat b = new Boat();
        System.out.println(p.getMake());
        System.out.println(b.getNumCabins());

        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a car model: ");
        String model = sc.nextLine();
        car1.setModel(model);
        System.out.print("Enter a color: ");
        String color = sc.nextLine();
        car1.setColor(color);

        cars.add(car1);

        Car car2 = new Car();
        System.out.print("Enter a car model: ");
        model = sc.nextLine();
        car2.setModel(model);
        System.out.print("Enter a color: ");
        color = sc.nextLine();
        car2.setColor(color);

        cars.add(car2);

        for (Car car: cars) {
            System.out.println(car.getColor() + " " + car.getModel());
        }

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
