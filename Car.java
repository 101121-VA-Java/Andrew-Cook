public class Car{
    // constructor
    // 2 states
    public int model;
    public String name;
    public String color;

    Car(){
    System.out.println("This message is inside the constructor");
    }

    public static void turnOn() {
        System.out.println("Car is running");
            }
    public static void turnOff() {
        System.out.println("Car is off");
    }
    public static void setColor(String newColor){
        color = newColor;
    }
}

