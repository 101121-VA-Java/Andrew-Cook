public class Calculator{

public static void main(String[] args) {

    int a = 20;

    int b = 5;

    int sum = add(a, b);
    System.out.println("20 + 5 = " + sum);

    int subtract = subtract(a, b);

    int multiply = multiply(a, b);

    int remainder = remainder(a, b);

    String day = "Wednesday";

    weekday(day);

    System.out.println();
    
    System.out.println("20 - 5 = " + subtract);
    System.out.println("20 * 5 = " + multiply);
    System.out.println("20 % 5 = " + remainder);
    System.out.println("Today is " + day);

    String newPerson = "Andy";
    String howdy = greeting(newPerson);
    System.out.println(howdy);

}
    public static int add(int a, int b){
        return a+b;
        }
        

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int remainder(int a, int b){
        return a%b;
    }

    public static String weekday(String day){
    
    String dayoftheweek;
    
    switch (day) {
        case "Monday": 
            dayoftheweek = "Bleh, it's Monday";
            break;
        case "Tuesday": 
            dayoftheweek = "Bleh, it's Tuesday";
            break;
        case "Wednesday": 
            dayoftheweek = "Bleh, it's Wednesday";
            break;
        case "Thursday": 
            dayoftheweek = "Bleh, it's Thursday";
            break;
        case "Friday": 
            dayoftheweek = "Bleh, it's Friday";
            break;
        default:
        dayoftheweek = "Not a weekday";
    }
    return dayoftheweek;
}

public static int countdown(int number){
    while(number > 0) {
        System.out.println(number);
        number--;
        if (number > 0){
            System.out.println("Number must be positive");
        }
    }
    return number;
}

public static String greeting(String name){
    String howdy;
    howdy = "Hi there, " + name;
    return howdy;
}
    
}
