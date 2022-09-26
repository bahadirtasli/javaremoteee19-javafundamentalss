package examples.objects;

/**
 * Default Constructor example
 *
 * @author bahadir tasli
 */
public class Traffic {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Audi Q7";

        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name = "Ford Mustang";

        car.name = "Toyota RAV4";

        Car car4 = new Car();
        car4.name = "LADA";
        car2 = car3;
        car3 = car4;

        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);

        System.gc();
    }
}
