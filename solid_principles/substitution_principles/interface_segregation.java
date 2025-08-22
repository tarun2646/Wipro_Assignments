package substitution_principles;
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print() { System.out.println("Printing..."); }
    public void scan() { System.out.println("Scanning..."); }
    public void fax() { System.out.println("Faxing..."); }
}

class SimplePrinter implements Printer {
    public void print() { System.out.println(" printing only."); }
}

public class interface_segregation {
    public static void main(String[] args) {
        Printer multi = new MultiFunctionPrinter();
        multi.print();

        Printer simple = new SimplePrinter();
        simple.print();
    }
}



