package substitution_principles;

interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card");
    }
}

public class open_closed{
    public static void main(String[] args) {
        Payment payment = new CardPayment(); // Change to CashPayment easily
        payment.pay(400);
    }
}



