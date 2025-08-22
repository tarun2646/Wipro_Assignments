package java_8_features_assignment;


interface Power {
    void showPower(int n);
    default void showDefault() {
        System.out.println("Default Power is: 42");
    }
}

public class Default_Power implements Power {
    public void showPower(int n) {
        System.out.println("Power is: " + n);
    }
    public static void main(String[] args) {
        Default_Power obj = new Default_Power();
        obj.showPower(10);
        obj.showDefault();
    }
}


