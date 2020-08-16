public class ObjectsVars {

    public static class Car {
        int speed;
        String color;
        // Constructor:
        public Car(int s, String c) {
            speed = s;
            color = c;
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(100, "green");
        System.out.println(c1.speed);
        System.out.println(c1.color);
    }
}

/* Output:
100
green
*/
