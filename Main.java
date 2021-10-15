public class Main {

public void main(String[] args){
    Car c = new Car();
    c.setName("Camry");
    c.setColor("White");

    System.out.println(c.name);
    System.out.println(c.color);
}

public static void turnOn() {
    Car c = new Car();
    Car.turnOn();
}
public static void turnOff() {
    System.out.println("Car is off");
}
}