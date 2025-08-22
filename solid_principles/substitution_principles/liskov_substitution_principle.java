package substitution_principles;
class Vehicle {
    void startEngine() {
        System.out.println("Starting vehicle engine");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started.");
    }
}

public class liskov_substitution_principle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();  
        Vehicle v2 = new Bike(); 

        v1.startEngine();  
        v2.startEngine(); 
    }
}
