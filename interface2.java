interface Vehicle {

    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);
}

class Bicycle implements Vehicle {

    int speed = 40;
    int gear = 3;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
class Car implements Vehicle {

    int speed = 80;
    int gear = 2;

    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class interface2 {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear( 2);
        bicycle.speedUp( 3);
        bicycle.applyBrakes( 1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Car car = new Car();
        car.changeGear( 1);
        car.speedUp( 4);
        car.applyBrakes( 3);

        System.out.println("car present state :");
        car.printStates();
    }
}